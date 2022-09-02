package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.entities.MovimientoDinero;
import com.belicos.proyecto.repositories.MovimientoDineroRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovimientoDineroService implements IMovimientoDineroService {

   MovimientoDineroRepository movimientoDineroRepository;

    public MovimientoDineroService(MovimientoDineroRepository movimientoDineroRepository) {
        this.movimientoDineroRepository = movimientoDineroRepository;
    }

    @Override
    public List<MovimientoDinero> listarMovimientoDineros() {
        return (List<MovimientoDinero>) movimientoDineroRepository.findAll();
    }

    @Override
    public void guardarMovimientoDineros(MovimientoDinero movimientoDinero) {
        movimientoDineroRepository.save(movimientoDinero);
    }

    @Override
    @Transactional
    public void eliminarMovimientoDineros(MovimientoDinero movimientoDinero) {
    movimientoDineroRepository.delete(movimientoDinero);
    }

    @Override
    public MovimientoDinero encontrarMovimientoDineros(MovimientoDinero movimientoDinero) {
        return movimientoDineroRepository.findById(movimientoDinero.getId()).orElse(null);
    }

}




