package com.micerditoprueba.domain.services;

import com.micerditoprueba.domain.Vehiculo;

import java.util.List;

public interface VehiculoService {
    Vehiculo registrarVehiculo(Vehiculo vehiculo);
    List<Vehiculo> listarVehiculos();
    }

