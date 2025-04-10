/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.naviera.ship;

import core.naviera.trip.Ruta;
import core.naviera.trip.Viaje;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public abstract class Barco {
    
    protected int matricula;
    protected String nombre;
    protected boolean bandera;
    protected String capitan;
    protected ArrayList<Ruta> rutas;
    protected ArrayList<Viaje> viajes;

    public Barco(int matricula, String nombre, boolean bandera, String capitan) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.bandera = bandera;
        this.capitan = capitan;
        this.rutas = new ArrayList<>();
        this.viajes = new ArrayList<>();
    }
    
    public void addRuta(Ruta ruta) {
        if (!this.rutas.contains(ruta)){
            this.rutas.add(ruta);
        }
    }
    
    public void addViaje(Viaje viaje) {
        this.viajes.add(viaje);
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isBandera() {
        return bandera;
    }

    public String getCapitan() {
        return capitan;
    }
    
    public int getNumRutas() {
        return this.rutas.size();
    }
    
    public int getNumViajes() {
        return this.viajes.size();
    }
    
    public double getGanancias() {
        double ganancias = 0;
        for (Viaje viaje : this.viajes) {
            ganancias += viaje.getGanancias();
        }
        return ganancias;
    }
    
}
