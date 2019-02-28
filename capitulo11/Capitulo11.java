/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11;

import Ejercicios.Actor;
import Ejercicios.BookArray;
import Ejercicios.Bridge;
import Ejercicios.BusinessLoan;
import Ejercicios.Chevy;
import Ejercicios.Child;
import Ejercicios.CreateLoans;
import Ejercicios.Cuadrado;
import Ejercicios.Cuadrado2;
import Ejercicios.DomesticDivision;
import Ejercicios.ElementsArray;
import Ejercicios.Fiction;
import Ejercicios.Ford;
import Ejercicios.FullTime;
import Ejercicios.GeometryArray;
import Ejercicios.Health;
import Ejercicios.House;
import Ejercicios.IncomingPhoneCall;
import Ejercicios.InternationalDivision;
import Ejercicios.Jupiterian;
import Ejercicios.Leaf;
import Ejercicios.Life;
import Ejercicios.Martian;
import Ejercicios.MetalElement;
import Ejercicios.Musician;
import Ejercicios.NoMetalElement;
import Ejercicios.NonFiction;
import Ejercicios.Novel;
import Ejercicios.Novella;
import Ejercicios.OutgoingPhoneCall;
import Ejercicios.Page;
import Ejercicios.Pancake;
import Ejercicios.PartTime;
import Ejercicios.PersonalLoan;
import Ejercicios.PhoneCallArray;
import Ejercicios.Poker;
import Ejercicios.School;
import Ejercicios.SevenDaySubscriber;
import Ejercicios.ShortStory;
import Ejercicios.StoryDemo;
import Ejercicios.Triangulo;
import Ejercicios.Triangulo2;
import Ejercicios.UseGeometric2;
import Ejercicios.WeekdaySubscriber;
import Ejercicios.WeekendSubscribers;

/**
 *
 * @author eriss
 */
public class Capitulo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
     System.out.println("\nEjercicio 1");
        Fiction fiction = new Fiction("SPACE",3.1);        
        System.out.println(fiction);
        NonFiction nofiction = new NonFiction("El diario",10.02);
        System.out.println(nofiction);
        System.out.println("B)");
        BookArray lib = new BookArray();
        lib.add(new Fiction("Gloria",33.1));
        lib.add(new NonFiction("It",66.66));
        lib.imprimir();
        System.out.println("\nEjercicio 2");
        System.out.println("A)");
        IncomingPhoneCall ic=new IncomingPhoneCall("342325453554");
        System.out.println(ic);
        OutgoingPhoneCall op=new OutgoingPhoneCall("9787348934",10);
        System.out.println(op);
        PhoneCallArray array = new PhoneCallArray();
        System.out.println("B)");
        array.add(op);
        array.add(ic);
        array.imprimir();
        System.out.println("\nEjercicio 3");
        Ford f= new Ford("Ford",333);
        System.out.println(f.toString());
        Chevy c=new Chevy("Cheby",312312);
        System.out.println(c.toString());
        System.out.println("\nEjercicio 4");
        InternationalDivision inter = new InternationalDivision("Division 3",324,"Colombia","Latino");
        inter.display();
        DomesticDivision dom = new DomesticDivision("Division 1",9273,"Mexico");
        dom.display();
        System.out.println("\nEjercicio 5");
        MetalElement metal1= new MetalElement("Hierro","Fe",26,55.865f);
        MetalElement metal2= new MetalElement("Calcio","Ca",20,40.078f);
        NoMetalElement nometal=new NoMetalElement("Hidrogeno","H",1,1.00797f);
        NoMetalElement nometa2=new NoMetalElement("Helio","He",2,4.0026f);
        System.out.println(metal1);
        System.out.println(metal2);
        System.out.println(nometal);
        System.out.println(nometa2);
        ElementsArray arrayE= new ElementsArray();
        arrayE.imprimir();
        System.out.println("\nEjercicio 6");
        SevenDaySubscriber ss=new SevenDaySubscriber("Vicente");
        System.out.println(ss);
        WeekdaySubscriber ws=new WeekdaySubscriber("Nicolas");
        System.out.println(ws);
        WeekendSubscribers wes=new WeekendSubscribers("Porfirio");
        System.out.println(wes);
        System.out.println("\nEjercicio 7");
        Novel n1=new Novel("Crepusculo","Toral",400);
        Novella nl1=new Novella("Destino","Juan",67);
        ShortStory sh1=new ShortStory("Hola","Franc",34);
        //sin las reglas
        Novel n2=new Novel("Como Saber si soy gay","Luis T",50);
        Novella nl2=new Novella("Pokemon","Jesus",34);
        ShortStory sh2=new ShortStory("Apex","Fornite",79);
        StoryDemo sd = new StoryDemo();
        sd.add(n1);
        sd.add(n2);
        sd.add(nl1);
        sd.add(nl2);
        sd.add(sh1);
        sd.add(sh2);
        sd.imprimir();
        System.out.println("\nEjercicio 8");
        Leaf l=new Leaf();
        l.turn();
        Page p=new Page();
        p.turn();
        Pancake pk=new Pancake();
        pk.turn();
        System.out.println("\nEjercicio 9");
        Health h=new Health("VIda");
        Life li=new Life("Salud");
        System.out.println(h);
        System.out.println("\nEjercicio 10");
        Cuadrado cua = new Cuadrado(4,4,"Cuadrado");
        Triangulo tri = new Triangulo(6,5,"Triangulo");
        GeometryArray geom=new GeometryArray();
        geom.add(tri);
        geom.add(cua);
        geom.imprimir();
         System.out.println("\nEjercicio 11");
        Cuadrado2 cuad2=new Cuadrado2(7,5,"Cuadrado");
        Triangulo2 tria2 = new Triangulo2(8,4,"Triangulo");
        UseGeometric2 useG=new UseGeometric2();
        useG.add(tria2);
        useG.add(cuad2);
        useG.imprimir();
        System.out.println("\nEjercicio 12");
        Child ch=new Child();
        ch.play();
        Musician m=new Musician();
        m.play();;
        Actor a=new Actor();
        a.play();
        System.out.println("\nEjercicio 13");
        FullTime full=new FullTime("Santiago",false);
        PartTime part = new PartTime("Edgar",true);
        System.out.println(full);
        System.out.println(part);
        System.out.println("\nEjercicio 14");
        House ho=new House(34,"Antigua",45,343);
        System.out.println(ho);
        School sc=new School(23,"Fecha debajo de un cementerio",34,"Universidad");
        System.out.println(sc);
         System.out.println("\nEjercicio 15");
        BusinessLoan busin = new BusinessLoan(1,"Erick",8934,7);
        BusinessLoan busin2 = new BusinessLoan(2,"Mitechell",93404,4);
        PersonalLoan per1=new PersonalLoan(3,"Echeverria",8492,1);
        PersonalLoan per2=new PersonalLoan(4,"Celaya",18439,4);
        CreateLoans arreglo=new CreateLoans();
        arreglo.add(busin);
        arreglo.add(busin2);
        arreglo.add(per1);
        arreglo.add(per2);
        arreglo.imprimir();
        
        System.out.println("\nGame Zone");
        Martian marciano=new Martian();
        System.out.println(marciano);
        Jupiterian jupiter = new Jupiterian();
        System.out.println(jupiter);
        
        System.out.println("\nEjercicio 1");
        Poker poker = new Poker();
        Bridge bridge=new Bridge();
        System.out.println(poker.displayDescription());
        System.out.println(bridge.displayDescription());
        
    }
    
}
