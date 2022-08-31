package com.belicos.proyecto.entities;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Empresa  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String direccion;
    private Long telefono;
    private Long  NIT;

}

