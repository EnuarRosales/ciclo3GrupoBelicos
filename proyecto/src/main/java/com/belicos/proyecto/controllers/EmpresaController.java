package com.belicos.proyecto.controllers;

import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.services.EmpresaService;
import com.belicos.proyecto.services.servicesRest.EmpresaServiceR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;

@Controller
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;


    public EmpresaController(EmpresaServiceR empresaServiceR) {
        this.empresaService = empresaService;
    }
    @GetMapping("/")
    public String index (Model model, @AuthenticationPrincipal OidcUser principal){
        return "index";
    }


    @GetMapping("/Empresa")
    public String inicio(Model model, @AuthenticationPrincipal SecurityProperties.User user) {
        var empresas = empresaService.listarEmpresas();
        model.addAttribute("empresas", empresas);
        return "empresa";

    }

    @GetMapping("/agregar")
    public String agregar(Empresa empresa) {
        return "modificar";

    }

    @PostMapping("/guardarEmpresa")
    public String guardar(@Valid Empresa empresa, Errors errores) {
        if(errores.hasErrors()){
            return "modificar";
        }
        empresaService.guardar(empresa);
        return "redirect:empresa";
    }




    @GetMapping("/editarEmpresa/{id}")
    public String editar(Empresa empresa, Model model) {
        empresa = empresaService.encontrarpersona(empresa);
        model.addAttribute("empresa", empresa);
        return "modificar";
    }


    @GetMapping("/eliminarEmpresa/{id}")
    public String eliminar(Empresa empresa) {
        empresaService.eliminar(empresa);
        return "redirect:empresa";
    }




}
