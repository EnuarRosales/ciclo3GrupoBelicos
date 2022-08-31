package com.belicos.proyecto.services.servicesRest;

import com.belicos.proyecto.entities.MovimientoDinero;
import com.belicos.proyecto.repositories.MovimientoDineroRepository;
import org.springframework.stereotype.Service;

@Service
public class MovimientoDineroServiceR {
    MovimientoDineroRepository movimientoDineroRepository;

    public MovimientoDineroServiceR(MovimientoDineroRepository movimientoDineroRepository) {
        this.movimientoDineroRepository = movimientoDineroRepository;
    }

    public MovimientoDinero  verMovimientoDineroID(MovimientoDinero movimientoDinero){
        return movimientoDineroRepository.findById(movimientoDinero.getId()).orElse(null);
    }

    public MovimientoDinero guardarMovimientoDineroID(MovimientoDinero movimientoDinero) {
        return movimientoDineroRepository.save(movimientoDinero);
    }


    public void deleteById(Long id){
        movimientoDineroRepository.deleteById(id);
    }





}
