package com.belicos.proyecto.entities;

public class Empleado {
    private String nombre;
    private  String email;
    private Empresa empresa;
    private String  rol;


    public Empleado(String nombre, String email, Empresa empresa, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.empresa = empresa;
        this.rol = rol;
    }

    public Empleado() {
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
