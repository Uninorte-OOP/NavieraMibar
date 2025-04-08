/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.naviera.trip;

import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Ruta {
    
    private ArrayList<String> ciudades;
    private ArrayList<Double> latitudes;
    private ArrayList<Double> longitudes;

    public Ruta(ArrayList<String> ciudades, ArrayList<Double> latitudes, ArrayList<Double> longitudes) {
        this.ciudades = ciudades;
        this.latitudes = latitudes;
        this.longitudes = longitudes;
    }
    
}
