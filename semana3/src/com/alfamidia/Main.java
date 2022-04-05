package com.alfamidia;

import com.alfamidia.Objetos;

public class Main {

    public static void main(String[] args) {

        Objetos.setValor2(300);

        Objetos obj1 = new Objetos(10);
        obj1.setValor1(20);
        //Objetos.setValor2(200);

        //System.out.println("Valores são " + obj1.getValor1() + " e " + Objetos.getValor2());

        System.out.println("Valores são " + obj1.getValor1() + " e " + obj1.calcula());

        Objetos obj2 = new Objetos(11);
        obj2.setValor1(21);
        //Objetos.setValor2(201);

        System.out.println("Valores são " + obj2.getValor1() + " e " + obj2.calcula());


        Objetos.setValor2(30);
        System.out.println("Valores são " + obj1.getValor1() + " e " + obj1.calcula());
        System.out.println("Valores são " + obj2.getValor1() + " e " + obj2.calcula());

        System.out.println("Este objeto é: " + obj1);
        System.out.println("Este objeto é: " + obj2);

     /*obj1.valor1;
     Objetos.valor2;*/



       /* System.out.println("Valores são " + obj2.getValor1() + " e " + Objetos.getValor2());

        System.out.println("Valores são " + obj1.getValor1() + " e " + Objetos.getValor2()); */


    }

}