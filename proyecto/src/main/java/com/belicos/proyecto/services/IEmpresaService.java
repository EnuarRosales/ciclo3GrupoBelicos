package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.Empresa;

import java.util.List;

public interface IEmpresaService {
    public List<Empresa> listarEmpresas();
    public void guardar(Empresa empresa);
    public void eliminar (Empresa empresa);
    public Empresa encontrarpersona(Empresa empresa);

}

