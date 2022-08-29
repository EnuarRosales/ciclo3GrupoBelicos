package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa>getEmpresas(){
    return this.empresaRepository.findAll();
    }

    public Empresa guardarEmpresa(Empresa empresa) {
        return this.empresaRepository.save(empresa);
    }







}
