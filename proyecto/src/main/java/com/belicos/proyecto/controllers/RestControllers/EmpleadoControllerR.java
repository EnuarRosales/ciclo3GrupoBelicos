package com.belicos.proyecto.controllers.RestControllers;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.services.servicesRest.EmpleadoServiceR;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoControllerR {

    EmpleadoServiceR empleadoServiceR;

    public EmpleadoControllerR(EmpleadoServiceR empleadoServiceR) {
        this.empleadoServiceR = empleadoServiceR;
    }

    @GetMapping("/users")
    public List<Empleado> verEmpleados(){
        return empleadoServiceR.getEmpleados();
    }

    @PostMapping("/users")
    public Empleado postEmpleado(@RequestBody Empleado empleado) {
        return this.empleadoServiceR.guardarEmpleado(empleado);
    }

    @GetMapping("/users/{id}")
    public Empleado verEmpleadoID_C(@PathVariable Long id) {
        return empleadoServiceR.verEmpleadoID(id);
    }

    @DeleteMapping("/users/{id}")
    public void eliminarEmpresaID_C(@PathVariable Long id){
        empleadoServiceR.eliminarEmpleadoID(id);
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
