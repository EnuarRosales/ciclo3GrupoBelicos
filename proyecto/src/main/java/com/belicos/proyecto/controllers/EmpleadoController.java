package com.belicos.proyecto.controllers;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.services.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/users")
    public List<Empleado> verEmpleados(){
        return empleadoService.getEmpleados();
    }

    @PostMapping("/users")
    public Empleado postEmpleado(@RequestBody Empleado empleado) {
        return this.empleadoService.guardarEmpleado(empleado);
    }

    @GetMapping("/users/{id}")
    public Empleado verEmpleadoID_C(@PathVariable Long id) {
        return empleadoService.verEmpleadoID(id);
    }

    @DeleteMapping("/users/{id}")
    public void eliminarEmpresaID_C(@PathVariable Long id){
        empleadoService.eliminarEmpleadoID(id);
    }






    /*


    OJO QUE ESTO ESTABA BIEN

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

*/








}
