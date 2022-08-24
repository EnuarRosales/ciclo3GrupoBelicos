package com.belicos.proyecto.controllers;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.entities.MovimientoDinero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpleadoController {
    List<Empleado> listaEmpleados = new ArrayList<Empleado>();
    List<MovimientoDinero> listaMovimientoDinero = new ArrayList<MovimientoDinero>();

    @GetMapping("/users")
    public List<Empleado> verEmpleados(){
        return listaEmpleados;
    }

    @PostMapping("/users")
    public List<Empleado> postEmpleado(@RequestBody Empleado empleados ) {
        listaEmpleados.add(empleados);
        return listaEmpleados;
    }

    @GetMapping("/users/{id}")
    public List<Empleado> eliminarEmpleado(@PathVariable int id){
        listaEmpleados.remove(id-1);
        return listaEmpleados;
    }




}
