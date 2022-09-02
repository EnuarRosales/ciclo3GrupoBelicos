package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService{
    private EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return (List<Empleado>) empleadoRepository.findAll();
    }

    @Override
    public void guardarEmpleados(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    @Transactional
    public void eliminarEmpleados(Empleado empleado) {
        empleadoRepository.delete(empleado);
    }

    @Override
    public Empleado encontrarEmpleado(Empleado empleado) {
        return empleadoRepository.findById(empleado.getId()).orElse(null);
    }
}



