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
public class FullTime extends Student{

    public FullTime(String name,Boolean status) {
        super(name,status);
        setStatus(status);
    }

    @Override
    public String id() {
        return String.format("Estado de tiempo completo: "+this.status);
    }

    @Override
    public void setStatus(Boolean status) {
        if(status==true){
            this.status=true;
        }else{
            this.status=false;
        }
    }
    @Override
    public String toString(){
        return String.format("El estudiante "+this.name+" paga una tarifa de $2000 "+id());
    }
    
}
