package com.alfamidia;

/**
 * Created by Márcio Ilson on 07/03/2022.
 */
public class Objetos {
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int valor1;
    //int valor1;

    public static int getValor2() {
        return valor2;
    }

    public static void setValor2(int valor2) {
        Objetos.valor2 = valor2;
    }

    static public int valor2;
    //static int valor2;

    public Objetos(int valor1) {
        this.valor1 = valor1;
    }
    public int calcula() {
        return valor1 * Objetos.valor2;
    }

    public String toString() {
        //return "uma string";
        return "O valor1 é " + this.valor1 + " e o valor estático valor2 é "+ Objetos.valor2;
    }

}
