package com.micerditoprueba.domain.services.impl;
import com.micerditoprueba.domain.Vehiculo;
import com.micerditoprueba.infrastracture.VehiculoRepository;
import com.micerditoprueba.domain.services.VehiculoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServiceImpl implements VehiculoService {
    private final VehiculoRepository vehiculoRepository;

    public VehiculoServiceImpl(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @Override
    public Vehiculo registrarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.findAll();
    }
}
