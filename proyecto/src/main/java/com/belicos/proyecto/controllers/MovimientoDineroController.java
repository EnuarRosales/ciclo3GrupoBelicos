package com.belicos.proyecto.controllers;

import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.entities.MovimientoDinero;
import com.belicos.proyecto.services.MovimientoDineroService;
import org.springframework.web.bind.annotation.*;


@RestController
public class MovimientoDineroController {
    MovimientoDineroService movimientoDineroService;

    public MovimientoDineroController(MovimientoDineroService movimientoDineroService) {
        this.movimientoDineroService = movimientoDineroService;
    }

    @GetMapping("/users/{id}/movements")
    public MovimientoDinero verMovimientoDinero(MovimientoDinero movimientoDinero){
        movimientoDinero =movimientoDineroService.verMovimientoDineroID(movimientoDinero);
        return  movimientoDinero;
    }


    @PostMapping("/users/{id_empleado}/movements")
    public MovimientoDinero postMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
        return this.movimientoDineroService.guardarMovimientoDineroID(movimientoDinero);
    }










    /*
    OJO QUE ESTO ESTABA BIEN


    List<MovimientoDinero> listaMovimientoDinero = new ArrayList<MovimientoDinero>();


    @GetMapping("/users/{id}/movements")
    public List<MovimientoDinero> verMovimientoDinero(@PathVariable int id){
        return Collections.singletonList(listaMovimientoDinero.get(id-1));
    }

    @PostMapping("/users/{id}/movements")
    public List<MovimientoDinero> postMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero ) {
        listaMovimientoDinero.add(movimientoDinero);
        return listaMovimientoDinero;
    }


    @GetMapping("/users/{id}/movements/eliminar")
    public List<MovimientoDinero> eliminarMovimientoDineroId(@PathVariable int id){
        return Collections.singletonList(listaMovimientoDinero.remove(id-1));
    }
*/



}
