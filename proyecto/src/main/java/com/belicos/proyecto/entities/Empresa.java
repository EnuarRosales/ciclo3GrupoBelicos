package com.belicos.proyecto.entities;


import javax.persistence.*;

@Entity
<<<<<<< HEAD
public class Empresa  {
=======
public class Empresa {

>>>>>>> 40c621a734fda836ab4e1eb9267e064f8bcee99f

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String direccion;
    private Long telefono;
    private Long  NIT;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


    //CONSTRUCTOR


    public Empresa(long id, String nombre, String direccion, Long telefono, Long NIT) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Empresa() {
    }


    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long  getTelefono() {
        return telefono;
    }

    public void setTelefono(Long  telefono) {
        this.telefono = telefono;
    }

    public Long  getNIT() {
        return NIT;
    }

    public void setNIT(Long  NIT) {
        this.NIT = NIT;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", NIT=" + NIT +
                '}';
    }
}

