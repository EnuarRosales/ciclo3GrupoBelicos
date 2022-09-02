package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.MovimientoDinero;

import java.util.List;

public interface IMovimientoDineroService {

    public List<MovimientoDinero> listarMovimientoDineros();
    public void guardarMovimientoDineros(MovimientoDinero movimientoDinero);
    public void eliminarMovimientoDineros (MovimientoDinero movimientoDinero);
    public MovimientoDinero encontrarMovimientoDineros(MovimientoDinero movimientoDinero);
}
