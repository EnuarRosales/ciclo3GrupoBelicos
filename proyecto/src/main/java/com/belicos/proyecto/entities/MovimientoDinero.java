package com.belicos.proyecto.entities;

public class MovimientoDinero {

    private Double montoMovimiento;

    private String conceptoMovimiento;

    private Empleado enpleado;

    public MovimientoDinero() {

    }

    public MovimientoDinero(Double montoMovimiento,  String conceptoMovimiento,Empleado enpleado) {
        this.montoMovimiento = montoMovimiento;

        this.conceptoMovimiento = conceptoMovimiento;
        this.enpleado=enpleado;
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
