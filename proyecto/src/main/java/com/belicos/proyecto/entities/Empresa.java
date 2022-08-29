package com.belicos.proyecto.entities;


import javax.persistence.*;

@Entity
public class Empresa  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String direccion;
    private Long telefono;
    private Long  NIT;

    //CONSTRUCTOR
    public Empresa(String nombre, String direccion, Long telefono, Long NIT) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }

    public Empresa() {
    }


    //GETTERS AND SETTERS
    public long getId() {
        return id;
    }

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

