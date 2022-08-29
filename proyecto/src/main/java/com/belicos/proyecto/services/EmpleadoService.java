package com.belicos.proyecto.services;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> getEmpleados(){
        return this.empleadoRepository.findAll();
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return this.empleadoRepository.save(empleado);
    }



}
