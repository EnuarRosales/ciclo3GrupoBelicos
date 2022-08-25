package com.belicos.proyecto.controllers;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.entities.MovimientoDinero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class EmpleadoController {
    List<Empleado> listaEmpleados = new ArrayList<Empleado>();


    @GetMapping("/users")
    public List<Empleado> verEmpleados(){
        return listaEmpleados;
    }

    @PostMapping("/users")
    public List<Empleado> postEmpleado(@RequestBody Empleado empleados ) {
        listaEmpleados.add(empleados);
        return listaEmpleados;
    }

    @GetMapping("/users/eliminar/{id}")
    public List<Empleado> eliminarEmpleadoId(@PathVariable int id){
        listaEmpleados.remove(id-1);
        return listaEmpleados;
    }


    @GetMapping("/users/{id}")
    public List<Empleado> verEmpleadoId(@PathVariable int id){
        return Collections.singletonList(listaEmpleados.get(id-1));
    }










}
