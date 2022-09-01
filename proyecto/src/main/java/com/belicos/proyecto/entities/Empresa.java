package com.belicos.proyecto.entities;


import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
public class Empresa implements Serializable {
    private  static final  long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String direccion;
    @NotNull
    private Long telefono;
    @NotNull
    private String NIT;

}

