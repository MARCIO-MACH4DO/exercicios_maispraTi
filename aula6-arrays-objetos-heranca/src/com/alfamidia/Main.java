package com.alfamidia;

public class Main {

    public static void main(String[] args) {
        // Objetos obj1 = new Objetos(10,20);

        // int[] x = {1,2,4};  se fosse um array de inteiros, eu poderia fazer dessa forma
        // int[] x = new int[];  ou dessa forma também
        // int[] x = new int[3];  ou dessa forma

        Objetos[] arrayObjetos = new Objetos[4];
        arrayObjetos[0] = new ObjetosTriangulares(10,20,100);
        arrayObjetos[1] = new Objetos(30,40);
        arrayObjetos[2] = new Objetos(50,60);
        arrayObjetos[3] = new ObjetosTriangulares(100,200,103);

        for(Objetos elemento: arrayObjetos) {
            elemento.exibe();
        }


    }
}

