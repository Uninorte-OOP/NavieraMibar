/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.naviera.trip;

import core.naviera.items.Carga;
import core.naviera.ship.Barco;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Viaje {
    
    private int id;
    private Barco barco;
    private Ruta ruta;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private ArrayList<Carga> cargas;

    public Viaje(int id, Barco barco, Ruta ruta, LocalDate fechaInicio, int days) {
        this.id = id;
        this.barco = barco;
        this.ruta = ruta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaInicio.plusDays(days);
        this.cargas = new ArrayList<>();
    }
    
    public void addCarga(Carga carga) {
        carga.setViaje(this);
        this.cargas.add(carga);
    }
    
}
