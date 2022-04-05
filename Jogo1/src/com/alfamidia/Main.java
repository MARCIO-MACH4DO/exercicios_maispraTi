package com.alfamidia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean continuarPartida = true;

        Scanner scanner = new Scanner(System.in);
         Cenario mapa = new Cenario();
        String entrada;

        while( continuarPartida ) {
            //System.out.println("Entre com as posições x e y no formato x,y");
            System.out.println("Entre com as posições x,y ou FIM para sair");
            entrada = scanner.nextLine();
            if (entrada.equals("FIM")) break;
            String[] numeros = entrada.split(",");
            int x = Integer.parseInt(numeros[0]);
            int y = Integer.parseInt(numeros[1]);
            System.out.println(("x = " + x + ", e y = " + y));
            //if (entrada.equals("FIM")) break;  Para Funcionar o FIM era só colocar o if logo abaixo de entrada=scanner.....//
            continuarPartida = mapa.disparo(x,y);
            mapa.desenhaCenario();
        }
    }
}
