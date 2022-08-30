package com.belicos.proyecto.controllers;

import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.services.EmpresaService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {
    EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/enterprises")
    public List<Empresa> EmpresaList(){
        return this.empresaService.getEmpresas();
    }

    @PostMapping("/enterprises")
    public Empresa  postEmpresa(@RequestBody Empresa empresa){
        return this.empresaService.guardarEmpresa(empresa);
    }


    @GetMapping("/enterprises/{id}")
    public Empresa verEmpresaID(@PathVariable Long id) {
        return empresaService.verEmpesaID(id);
    }

    @DeleteMapping("/enterprises/eliminar/{id}")
    public void delete(@PathVariable Long id){
        empresaService.eliminarEmpresaID(id);
    }


    @GetMapping("/enterprises/editar/{id}")
    public String editar(Empresa empresa, Model model){
        empresa = empresaService.encontrarEmpresa(empresa);
        model.addAttribute("empresa", empresa);
        return "modificar";
    }







}







