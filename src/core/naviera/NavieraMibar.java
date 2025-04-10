/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.naviera;

import core.client.Cliente;
import core.naviera.items.Carga;
import core.naviera.ship.Barco;
import core.naviera.ship.BarcoAlquilado;
import core.naviera.ship.BarcoPropio;
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
    
    public Barco getBarco(int barcoMatricula) {
        for (Barco barco : this.barcos) {
            if (barco.getMatricula() == barcoMatricula) {
                return barco;
            }
        }
        return null;
    }
    
    public Cliente getCliente(int clienteId) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getId() == clienteId) {
                return cliente;
            }
        }
        return null;
    }
    
    public Ruta getRuta(int index) {
        return this.rutas.get(index);
    }
    
    public Viaje getViaje(int index) {
        return this.viajes.get(index);
    }
    
    public void showResumenBarcos() {
        int index = 1;
        for (Barco barco : this.barcos) {
            System.out.println("Barco " + String.format("%02d", index) + ":");
            System.out.println("- Matricula: " + barco.getMatricula());
            System.out.println("- Nombre: " + barco.getNombre());
            System.out.println("- Bandera: " + (barco.isBandera() ? "Si" : "No"));
            System.out.println("- Capitan: " + barco.getCapitan());
            if (barco instanceof BarcoAlquilado barcoAlquilado) {
                System.out.println("- Empresa: " + barcoAlquilado.getEmpresa());
                System.out.println("- Fecha Inicio: " + barcoAlquilado.getFechaInicio());
                System.out.println("- Fecha Fin: " + barcoAlquilado.getFechaFin());
            }
            System.out.println("- Numero de Rutas: " + barco.getNumRutas());
            System.out.println("- Numero de Viajes: " + barco.getNumViajes());
            System.out.println("- Ingresos: " + String.format("%.2f", barco.getGanancias()).replace(",", ".") + "\n");
            index++;
        }
    }
    
    public void showBarcoPropioMayorIngresos() {
        BarcoPropio mayorBarco = null;
        double mayorIngreso = 0;
        for (Barco barco : this.barcos) {
            if (barco instanceof BarcoPropio barcoPropio) {
                if (barcoPropio.getGanancias() > mayorIngreso) {
                    mayorIngreso = barcoPropio.getGanancias();
                    mayorBarco = barcoPropio;
                }
            }
        }
        System.out.println("El barco propio que mayores ingresos le ha generado a la compania fue " + 
                mayorBarco.getNombre() + " registrado con matricula No. " + mayorBarco.getMatricula() + 
                ", con unos ingresos totales de $" + 
                String.format("%.2f", mayorIngreso).replace(",", ".") + "\n");
    }
    
    public void showClienteMayorGasto() {
        Cliente mayorCliente = null;
        double mayorGasto = 0;
        for (Cliente cliente : this.clientes) {
            if (cliente.getGasto() > mayorGasto) {
                mayorGasto = cliente.getGasto();
                mayorCliente = cliente;
            }
        }
        System.out.println("El cliente que ha tenido un mayor gasto en sus envios es " + 
                mayorCliente.getNombre() + " con identificacion " + mayorCliente.getId() + 
                " del pais " + mayorCliente.getPais() + ", con un gasto total de $" + 
                String.format("%.2f", mayorGasto).replace(",", ".") + "\n");
    }
    
    public void showCargaMayorValor() {
        Carga mayorCarga = null;
        double mayorCosto = 0;
        for (Cliente cliente : this.clientes) {
            for (Carga carga : cliente.getCargas()) {
                if (carga.getCosto() > mayorCosto) {
                    mayorCosto = carga.getCosto();
                    mayorCarga = carga;
                }
            }
        }
        System.out.println("La carga con un mayor valor fue enviada por el cliente " + 
                mayorCarga.getCliente().getNombre() + " y tuvo un costo de $" + 
                String.format("%.2f", mayorCosto).replace(",", "."));
    }
    
}
