package com.micerditoprueba.infrastracture.validators;
import com.micerditoprueba.domain.Vehiculo;
import com.micerditoprueba.infrastracture.exception.IncorrectResourceRequestException;

public class VehiculoValidator {

    public static void validate(Vehiculo vehiculo) {

        if (vehiculo.getPlaca_vehiculo().length() < 6) {
            throw new IncorrectResourceRequestException("El numero de placa debe ser mayor a 6 caracteres.");
        }

        if (vehiculo.getPlaca_vehiculo().length() > 8) {
            throw new IncorrectResourceRequestException("El numero de placa debe ser menor a 8 caracteres.");
        }
    }
}


