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
public abstract class GeometricFigure2 {
    public Integer ancho;
    public Integer alto;
    public String tipo;

    public GeometricFigure2(Integer ancho, Integer alto, String tipo) {
        this.ancho = ancho;
        this.alto = alto;
        this.tipo = tipo;
    }
    public abstract Double area();
    public abstract String datos();
}
