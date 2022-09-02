package com.belicos.proyecto.controllers;


import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.services.EmpleadoService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class EmpleadoController {

   EmpleadoService empleadoService;
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/Empleado")
    public String inicio(Model model, @AuthenticationPrincipal SecurityProperties.User user) {
        var empleados = empleadoService.listarEmpleados();
        model.addAttribute("empleados", empleados);
        return "empleado";

    }


    @GetMapping("/agregarEmpleado")
    public String agregar(Empleado empleado) {
        return "modificarEmpleado";

    }


    @PostMapping("/guardarEmpleado")
    public String guardar(@Valid Empleado empleado, Errors errores) {
        if(errores.hasErrors()){
            return "modificarEmpleado";
        }
        empleadoService.guardarEmpleados(empleado);
        return "redirect:/Empleado";
    }




    @GetMapping("/editarEmpleado/{id}")
    public String editar(Empleado empleado, Model model) {
        empleado = empleadoService.encontrarEmpleado(empleado);
        model.addAttribute("empleado", empleado);
        return "modificarEmpleado";
    }


    @GetMapping("/eliminarEmpleado/{id}")
    public String eliminar(Empleado empleado) {
        empleadoService.eliminarEmpleados(empleado);
        return "redirect:/Empleado";
    }








}
