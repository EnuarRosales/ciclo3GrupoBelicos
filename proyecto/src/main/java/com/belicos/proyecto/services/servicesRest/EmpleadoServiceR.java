package com.belicos.proyecto.services.servicesRest;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceR {

    EmpleadoRepository empleadoRepository;

    public EmpleadoServiceR(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> getEmpleados(){
        return this.empleadoRepository.findAll();
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return this.empleadoRepository.save(empleado);
    }

    public Empleado verEmpleadoID(Long id){
        Optional<Empleado> optMarca= empleadoRepository.findById(id);
        if(optMarca.isPresent()){
            return optMarca.get();
        }
        else {
            return  new Empleado();
        }
    }
    public void eliminarEmpleadoID(Long id){
        empleadoRepository.deleteById(id);
    }





}
