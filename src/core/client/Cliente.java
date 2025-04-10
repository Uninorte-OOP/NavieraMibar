/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.client;

import core.naviera.items.Bulto;
import core.naviera.items.Carga;
import java.time.LocalDate;
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
    
    public void createCarga(String puertoOrigen, String puertoDestino, LocalDate fechaMax, ArrayList<Bulto> inventario) {
        this.cargas.add(new Carga(this, puertoOrigen, puertoDestino, fechaMax, inventario));
    }
    
    public Carga getCarga(int index) {
        return this.cargas.get(index);
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Carga> getCargas() {
        return cargas;
    }
    
    public double getGasto() {
        double gasto = 0;
        for (Carga carga : this.cargas) {
            gasto += carga.getCosto();
        }
        return gasto;
    }
    
}
