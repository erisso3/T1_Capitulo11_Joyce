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
public class InternationalDivision extends Division{
    private String pais;
    private String idioma;
    public InternationalDivision(String name, Integer account,String pais, String idioma) {
        super(name, account);
        this.pais=pais;
        this.idioma=idioma;
    }

    @Override
    public void display() {
        System.out.println(" "+name+" Numero: "+account+" "+pais+" "+idioma);
    }
}
