/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.ArrayList;

/**
 *
 * @author eriss
 */
public class StoryDemo {
    private ArrayList<Story>historias;

    public StoryDemo() {
        historias=new ArrayList<>();
    }
    public void add(Story a){
        historias.add(a);
    }
    public void imprimir(){
     for(Story t: historias){
         System.out.println(t);
     }   
    }            
}
