/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.naviera;

import core.client.Cliente;
import core.naviera.ship.Barco;
import core.naviera.trip.Ruta;
import core.naviera.trip.Viaje;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class NavieraMibar {
    
    private ArrayList<Barco> barcos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Ruta> rutas;
    private ArrayList<Viaje> viajes;

    public NavieraMibar() {
        this.barcos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.rutas = new ArrayList<>();
        this.viajes = new ArrayList<>();
    }
    
    public void addBarco(Barco barco) {
        this.barcos.add(barco);
    }
    
    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public void addRuta(ArrayList<String> ciudades, ArrayList<Double> latitudes, ArrayList<Double> longitudes) {
        this.rutas.add(new Ruta(ciudades, latitudes, longitudes));
    }
    
    public void addViaje(int id, Barco barco, Ruta ruta, LocalDate fechaInicio, int days) {
        this.viajes.add(new Viaje(id, barco, ruta, fechaInicio, days));
    }
    
}
