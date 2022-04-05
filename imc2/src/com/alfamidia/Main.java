package com.alfamidia;

import java.util.Scanner;

public class Main {
    public static void calculoImc(float peso, float altura) {
        double[] pesosImc = {18.5,24.9,29.9,39.9,90000};
        String[] classificacoesImc = {"Magreza","Normal","Sobrepeso","Obesidade","Obesidade Grave"};


       // System.out.println(pesosImc[3]); Testanto o array pela posição


        float imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);


        String classificacao = "";
        int i = 0;
        while (imc > pesosImc[i]) {
            i++;
        }
        classificacao = classificacoesImc[i];
        System.out.println("A classificação é: " + classificacao);
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o peso em Kg: ");
        float peso = entrada.nextFloat();
        System.out.println("Entre com a altura em metros: ");
        float altura = entrada.nextFloat();
        calculoImc(peso,altura);

    }






}
