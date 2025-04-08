/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.client;

/**
 *
 * @author edangulo
 */
public class ClienteJuridico extends Cliente {
    
    private int idRepresentante;
    private String nombreRepresentante;
    private String telefonoRepresentante;

    public ClienteJuridico(int id, String nombre, String direccion, String telefono, String pais, int idRepresentante, String nombreRepresentante, String telefonoRepresentante) {
        super(id, nombre, direccion, telefono, pais);
        this.idRepresentante = idRepresentante;
        this.nombreRepresentante = nombreRepresentante;
        this.telefonoRepresentante = telefonoRepresentante;
    }
    
}
