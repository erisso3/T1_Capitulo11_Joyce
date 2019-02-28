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
public class WeekendSubscribers extends NewspaperSubscriber {

    public WeekendSubscribers(String Calle) {
        super(Calle);
        setTasa();
    }

    public String toString(){
        return String.format("Calle:%s\nTarifa:%.2f\nTipo:Weekend",this.getCalle(),this.getTasa());
    }
    @Override
    public void setTasa() {
        this.Tasa=2.0;
    }
    
}
