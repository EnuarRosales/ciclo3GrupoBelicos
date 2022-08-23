package com.belicos.proyecto.controllers;

import com.belicos.proyecto.entities.Empresa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class EmpresaController {
    List<Empresa> listaEmpresas = new ArrayList<Empresa>();

    @GetMapping("/enterprises")
    public List<Empresa> verEmpresa(){
        return listaEmpresas;
    }


    @PostMapping("/enterprises")
    public List<Empresa> postEmpresa(@RequestBody Empresa empresas) {
        listaEmpresas.add(empresas);
        return listaEmpresas;
    }

    @GetMapping("/enterprises/{id}")
    public List<Empresa> verEmpresaId(@PathVariable int id){
        return Collections.singletonList(listaEmpresas.get(id-1));
    }

    @GetMapping("/enterprises/eliminar/{id}")
    public List<Empresa> eliminarEmpresaId(@PathVariable int id){
        return Collections.singletonList(listaEmpresas.remove(id-1));
    }

    /*
    @GetMapping("/enterprises/{id}")
    public List<Empresa> editarEmpresaId(@PathVariable int id, @RequestBody Empresa empresas){
        listaEmpresas.remove(new Empresa(id));
        listaEmpresas.add(empresas);
        return listaEmpresas;
    }
    */

    }


    /*
    @GetMapping("/enterprises/{id}")
    public List<Empresa> editarEmpresaId(@PathVariable int id, @RequestBody Empresa empresas){
        Collections.singletonList(listaEmpresas.add(empresas));
        listaEmpresas.add(empresas);
        return Collections.singletonList(listaEmpresas.get(id-1));
    }
*/




