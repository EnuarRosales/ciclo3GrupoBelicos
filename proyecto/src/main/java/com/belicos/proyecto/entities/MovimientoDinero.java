package com.belicos.proyecto.entities;

import javax.persistence.*;

@Entity
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double montoMovimiento;

    private String conceptoMovimiento;

    @ManyToOne
    @JoinColumn(name= "empleado_id")
    private Empleado enpleado;

    public MovimientoDinero() {

    }

    public MovimientoDinero(Double montoMovimiento, String conceptoMovimiento, Empleado enpleado) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.enpleado = enpleado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getMontoMovimiento() {
        return montoMovimiento;
    }

    public String getEnpleado() {
        return enpleado.toString();
    }

    public void setMontoMovimiento(Double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }


    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }


    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "montoMovimiento=" + montoMovimiento +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", enpleado=" + enpleado +
                '}';
    }
}
