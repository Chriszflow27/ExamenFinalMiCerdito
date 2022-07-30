package com.micerditoprueba.application;

import com.micerditoprueba.domain.Vehiculo;
import com.micerditoprueba.domain.services.VehiculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.micerditoprueba.WrapperResponse;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {
    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @PostMapping
    public ResponseEntity<WrapperResponse<Vehiculo>>registrarVehiculo(@Valid @RequestBody Vehiculo vehiculo){
        Vehiculo vehiculoNew = vehiculoService.registrarVehiculo(vehiculo);
        return new WrapperResponse<>(true, "message", vehiculoNew).createResponse();
    }

    @GetMapping
    public ResponseEntity<WrapperResponse<List<Vehiculo>>>listarVehiculos(){
        List<Vehiculo> vehiculos = vehiculoService.listarVehiculos();
        return new WrapperResponse<>(true, "success", vehiculos).createResponse();
    }

}