package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Empresa verEmpesaID(Long id){
        Optional<Empresa> optMarca= empresaRepository.findById(id);
        if(optMarca.isPresent()){
            return optMarca.get();
        }
        else {
            return  new Empresa();
        }
    }

    public void eliminarEmpresaID(Long id){
        empresaRepository.deleteById(id);
    }


    public Empresa encontrarEmpresa(Empresa empresa) {
        return empresaRepository.findById(empresa.getId()).orElse(null);

    }












}
