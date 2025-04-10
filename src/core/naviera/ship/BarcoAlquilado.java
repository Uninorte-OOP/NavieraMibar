/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.naviera.ship;

import java.time.LocalDate;

/**
 *
 * @author edangulo
 */
public class BarcoAlquilado extends Barco {
    
    private String empresa;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public BarcoAlquilado(int matricula, String nombre, boolean bandera, String capitan, String empresa, LocalDate fechaInicio, int months) {
        super(matricula, nombre, bandera, capitan);
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaInicio.plusMonths(months);
    }

    public String getEmpresa() {
        return empresa;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    
}
