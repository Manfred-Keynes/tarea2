/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gerso
 */
public class Tipo  {
    
    public String tipo;
    
    public Tipo(){}

  

    public Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   
    public void agregar()
    {
        System.out.println("Tipo: " + this.getTipo());
    }
    
    
}
