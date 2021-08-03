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
public class Tarjeta extends Propietario{
    
    public String numeroTarjeta,uso;
    
    
    
    public Tarjeta(){}
    
    public Tarjeta(String numeroTarjeta, String uso,  String nit, String cui,String nombres, String apellidos, String direccion, int telefono, String fechaNacimiento)
    {
        super(nit, cui,nombres, apellidos, direccion, telefono, fechaNacimiento);
        this.numeroTarjeta = numeroTarjeta;
        
        this.uso = uso;
    }

    
   public String getNumeroTarjeta() {
    return numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
    this.numeroTarjeta = numeroTarjeta;
    }
    public String getUso() {
    return uso;
    }
    public void setUso(String uso) {
    this.uso = uso;
    
    }
    @Override
    public void agregar() {
        System.out.println("Nit:" + this.getNit());
        System.out.println("Cui:" + this.getCui());
        
        System.out.println("Numero tarjeta: " + this.getNumeroTarjeta());
        System.out.println("Uso :" + this.getUso());
        System.out.println("Nombres: " + this.getNombres());
        System.out.println("Aoellidos: " + this.getApellidos());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Fecha Nacimiento: " + this.getFechaNacimiento());
    }

    
   
}
