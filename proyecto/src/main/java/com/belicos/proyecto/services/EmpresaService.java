package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpresaService implements IEmpresaService {


    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @Override
    public void guardar(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    @Override
    @Transactional
    public void eliminar(Empresa empresa) {
        empresaRepository.delete(empresa);
    }

    @Override
    public Empresa encontrarpersona(Empresa empresa) {
        return empresaRepository.findById(empresa.getId()).orElse(null);
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return (List<Empresa>) empresaRepository.findAll();
    }


}
