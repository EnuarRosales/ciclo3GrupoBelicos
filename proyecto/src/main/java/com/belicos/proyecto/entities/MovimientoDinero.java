package com.belicos.proyecto.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
public class MovimientoDinero implements Serializable {
    private  static final  long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private long montoMovimiento;
    @NotEmpty
    private String conceptoMovimiento;
    @ManyToOne
    @JoinColumn(name= "empleado_id")
    private Empleado enpleado;


}
