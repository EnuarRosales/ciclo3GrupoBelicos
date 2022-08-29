package com.belicos.proyecto.entities;

import javax.persistence.*;
@Entity
public class Empleado  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private  String email;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    private String  rol;


    public Empleado() {
    }


    public Empleado(String nombre, String email, Empresa empresa, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.empresa = empresa;
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", empresa=" + empresa +
                ", rol='" + rol + '\'' +
                '}';
    }
}
