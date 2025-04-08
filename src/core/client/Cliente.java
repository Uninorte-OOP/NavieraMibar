/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.client;

import core.naviera.items.Carga;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public abstract class Cliente {
    
    protected int id;
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String pais;
    protected ArrayList<Carga> cargas;

    public Cliente(int id, String nombre, String direccion, String telefono, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pais = pais;
        this.cargas = new ArrayList<>();
    }
    
}
