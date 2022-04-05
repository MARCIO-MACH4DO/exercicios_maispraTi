package com.alfamidia;

import java.util.Random;

/**
 * Created by Márcio Ilson on 14/03/2022.
 */
public class Pecas {
    private int x;
    private int y;

    public boolean isVivo() {
        return vivo;
    }

    private boolean vivo;


    public Pecas() {
        Random aleatorio = new Random();
        this.x = aleatorio.nextInt(10);     //nextInt é um método da classe Random
        this.y = aleatorio.nextInt(10);
        this.vivo = true;
    }

    public double disparo(int x, int y) {
        double distancia = Math.sqrt((x-this.x) * (x-this.x) + (y-this.y) * (y-this.y));
        if (distancia == 0) this.vivo = false;
        return distancia;
    }
}
