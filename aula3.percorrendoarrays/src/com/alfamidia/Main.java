package com.alfamidia;

public class Main {

    public static void main(String[] args) {

        // int[] arrayInteiros = new int[]  - poderíamos criar desta forma
        int[] arrayInteiros = {10,20,30,40,50};

        for(int i = 0; i < arrayInteiros.length; i++) {
            // int elemento = arrayInteiros[i]; - com esta linha ficaria exatamente igual ao segunfo for abaixo
            System.out.println(arrayInteiros[i]);
            }
        System.out.println("--------------");
        for(int elemento: arrayInteiros) {
            System.out.println(elemento);
        }
    }
}
