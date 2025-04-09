/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.naviera.items;

import core.client.Cliente;
import core.naviera.trip.Viaje;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Carga {
    
    private Cliente cliente;
    private Viaje viaje;
    private String puertoOrigen;
    private String puertoDestino;
    private LocalDate fechaMax;
    private ArrayList<Bulto> inventario;

    public Carga(Cliente cliente, String puertoOrigen, String puertoDestino, LocalDate fechaMax, ArrayList<Bulto> inventario) {
        this.cliente = cliente;
        this.viaje = null;
        this.puertoOrigen = puertoOrigen;
        this.puertoDestino = puertoDestino;
        this.fechaMax = fechaMax;
        this.inventario = inventario;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
    
}
