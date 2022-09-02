package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.entities.Empresa;

import java.util.List;

public interface IEmpleadoService {

    public List<Empleado> listarEmpleados();
    public void guardarEmpleados(Empleado empleado);
    public void eliminarEmpleados (Empleado empleado);
    public Empleado encontrarEmpleado(Empleado empleado);
}
