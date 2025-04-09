/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.naviera.items;

/**
 *
 * @author edangulo
 */
public class Bulto {
    
    private int serial;
    private String descripcion;
    private double peso;
    private double alto;
    private double ancho;
    private double largo;
    private double costo;

    public Bulto(int serial, String descripcion, double peso, double alto, double ancho, double largo) {
        this.serial = serial;
        this.descripcion = descripcion;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.costo = this.calculateCosto();
    }
    
    private double calculateCosto() {
        return this.peso / (this.alto * this.ancho * this.largo);
    }
    
}
