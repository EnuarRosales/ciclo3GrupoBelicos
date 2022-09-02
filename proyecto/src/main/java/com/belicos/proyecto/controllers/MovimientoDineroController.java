package com.belicos.proyecto.controllers;


import com.belicos.proyecto.entities.MovimientoDinero;
import com.belicos.proyecto.services.MovimientoDineroService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MovimientoDineroController {
    MovimientoDineroService movimientoDineroService;

    public MovimientoDineroController(MovimientoDineroService movimientoDineroService) {
        this.movimientoDineroService = movimientoDineroService;
    }

    @GetMapping("/movimientoDinero")
    public String inicio(Model model, @AuthenticationPrincipal SecurityProperties.User user) {
        var movimientoDineros = movimientoDineroService.listarMovimientoDineros();
        model.addAttribute("movimientoDineros", movimientoDineros);
        return "movimientoDinero";

    }


    @GetMapping("/agregarMovimientoDinero")
    public String agregar(MovimientoDinero movimientoDinero) {
        return "modificarMovimientoDinero";

    }


    @PostMapping("/guardarMovimientoDinero")
    public String guardar(@Valid MovimientoDinero movimientoDinero, Errors errores) {
        if(errores.hasErrors()){
            return "modificarMovimientoDinero";
        }
        movimientoDineroService.guardarMovimientoDineros(movimientoDinero);
        return "redirect:/movimientoDinero";
    }


    @GetMapping("/editarMovimientoDinero/{id}")
    public String editar(MovimientoDinero movimientoDinero, Model model) {
        movimientoDinero = movimientoDineroService.encontrarMovimientoDineros(movimientoDinero);
        model.addAttribute("movimientoDinero", movimientoDinero);
        return "modificarMovimientoDinero";
    }


    @GetMapping("/eliminarMovimientoDinero/{id}")
    public String eliminar(MovimientoDinero movimientoDinero) {
        movimientoDineroService.eliminarMovimientoDineros(movimientoDinero);
        return "redirect:/movimientoDinero";
    }




}
