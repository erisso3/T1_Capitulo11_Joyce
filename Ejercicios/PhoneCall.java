/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author eriss
 */
public abstract class PhoneCall {
    public  String NumeroT;
    public   double Precio;
    
    public PhoneCall(String NumeroT) {
        this.NumeroT = NumeroT;
        this.Precio = 0.0f;
    }
    
    public abstract String getNumeroT();
    public abstract double getPrecio();
    public abstract String toString();
    
    public abstract void setPrecio();
    
}
