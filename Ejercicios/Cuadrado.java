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
public class Cuadrado extends GeometricFigure{

    public Cuadrado(Integer ancho, Integer alto, String tipo) {
        super(ancho, alto, tipo);
    }

    @Override
    public Double area() {
        return (double)((ancho*alto));
    }
    @Override
    public String datos(){
        return String.format(tipo+" de altura "+alto+" de ancho "+ancho+" tiene un area de: "+this.area());
    }
}
