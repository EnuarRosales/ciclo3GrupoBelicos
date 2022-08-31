package com.belicos.proyecto.controllers.RestControllers;

import com.belicos.proyecto.entities.MovimientoDinero;
import com.belicos.proyecto.services.servicesRest.MovimientoDineroServiceR;
import org.springframework.web.bind.annotation.*;


@RestController
public class MovimientoDineroControllerR {
    MovimientoDineroServiceR movimientoDineroServiceR;

    public MovimientoDineroControllerR(MovimientoDineroServiceR movimientoDineroServiceR) {
        this.movimientoDineroServiceR = movimientoDineroServiceR;
    }

    @GetMapping("/users/{id}/movements")
    public MovimientoDinero verMovimientoDinero(MovimientoDinero movimientoDinero){
        movimientoDinero = movimientoDineroServiceR.verMovimientoDineroID(movimientoDinero);
        return  movimientoDinero;
    }


    @PostMapping("/users/{id_empleado}/movements")
    public MovimientoDinero postMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
        return this.movimientoDineroServiceR.guardarMovimientoDineroID(movimientoDinero);
    }


    @DeleteMapping(value = "/{id}/movements")
    public void delete(@PathVariable Long id){
        movimientoDineroServiceR.deleteById(id);
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
