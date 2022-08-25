package com.belicos.proyecto.controllers;
import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.entities.MovimientoDinero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class MovimientoDineroController {

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




}
