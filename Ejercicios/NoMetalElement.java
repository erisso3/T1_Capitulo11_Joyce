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
public class NoMetalElement extends Element{
    public NoMetalElement(String name, String symbol, Integer atomic, Float atomicWeigth) {
        super(name, symbol, atomic, atomicWeigth);
    }
    @Override
    public String toString(){
        return String.format("Metales no conductores %s",this.describeElement());
    }
            
    @Override
    public String describeElement() {
       return String.format(this.name+"("+this.symbol+")"+" Numero atomico: "+this.atomic+" Peso atomico: "+this.atomicWeigth);
    }   
}
