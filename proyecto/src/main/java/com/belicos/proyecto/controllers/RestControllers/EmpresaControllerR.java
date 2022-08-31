package com.belicos.proyecto.controllers.RestControllers;

import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.services.servicesRest.EmpresaServiceR;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class EmpresaControllerR {

    EmpresaServiceR empresaServiceR;


    public EmpresaControllerR(EmpresaServiceR empresaServiceR) {
        this.empresaServiceR = empresaServiceR;
    }


    @GetMapping("/enterprises")
    public List<Empresa> EmpresaList(){
        return this.empresaServiceR.getEmpresas();
    }

    @PostMapping("/enterprises")
    public Empresa  postEmpresa(@RequestBody Empresa empresa){
        return this.empresaServiceR.guardarEmpresa(empresa);
    }


    @GetMapping("/enterprises/{id}")
    public Empresa verEmpresaID(@PathVariable Long id) {
        return empresaServiceR.verEmpesaID(id);
    }

    @DeleteMapping("/enterprises/eliminar/{id}")
    public void delete(@PathVariable Long id){
        empresaServiceR.eliminarEmpresaID(id);
    }



    @GetMapping("/enterprises/editar/{id}")
    public String editar(Empresa empresa, Model model){
        empresa = empresaServiceR.encontrarEmpresa(empresa);
        model.addAttribute("empresa", empresa);
        return "modificar";
    }





}







