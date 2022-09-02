package com.belicos.proyecto.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


@Data
@Entity
public class Empleado implements Serializable {
    private  static final  long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String email;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    @NotEmpty
    private String rol;
}

