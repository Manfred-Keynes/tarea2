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
abstract class Persona {

    private String nombres;
    private String apellidos;
    private String direccion;
    private int telefono;
    private String fechaNacimiento;
    
    public Persona(){}
    public Persona(String nombres, String apellidos, String direccion, int telefono, String fechaNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
       
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
   public void agregar(){}
   public void mostrar(){}
   public void edad(String fechaNacimiento){}
}
