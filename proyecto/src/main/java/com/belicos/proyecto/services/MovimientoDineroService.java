package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.entities.MovimientoDinero;
import com.belicos.proyecto.repositories.MovimientoDineroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoDineroService {
    MovimientoDineroRepository movimientoDineroRepository;

    public MovimientoDineroService(MovimientoDineroRepository movimientoDineroRepository) {
        this.movimientoDineroRepository = movimientoDineroRepository;
    }

    public MovimientoDinero  verMovimientoDineroID(MovimientoDinero movimientoDinero){
        return movimientoDineroRepository.findById(movimientoDinero.getId()).orElse(null);
    }

    public MovimientoDinero guardarMovimientoDineroID(MovimientoDinero movimientoDinero) {
        return movimientoDineroRepository.save(movimientoDinero);
    }





}
