/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.naviera;

import core.client.Cliente;
import core.naviera.ship.Barco;
import core.naviera.trip.Ruta;
import core.naviera.trip.Viaje;
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
    
}
