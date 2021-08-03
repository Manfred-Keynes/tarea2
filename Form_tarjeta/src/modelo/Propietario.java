/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author gerso
 */
public class Propietario extends Persona {
    public String nit;
    public String cui;

    public Propietario(){}
    public Propietario(String nit, String cui, String nombres, String apellidos, String direccion, int telefono, String fechaNacimiento) {
        super(nombres, apellidos, direccion, telefono, fechaNacimiento);
        this.nit = nit;
        this.cui = cui;
    }

 
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }
    
    @Override
    public void agregar()
    {
        
        
        System.out.println("Nit: " + this.getNit());
        System.out.println("Cui: " + this.getCui());
        System.out.println("Nombres: " + this.getNombres());
        System.out.println("Aoellidos: " + this.getApellidos());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Fecha Nacimiento: " + this.getFechaNacimiento());
    }

    
}
