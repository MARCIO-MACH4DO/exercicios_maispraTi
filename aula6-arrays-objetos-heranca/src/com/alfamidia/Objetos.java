package com.alfamidia;

/**
 * Created by Márcio Ilson on 09/03/2022.
 */
public class Objetos {
    protected int v1;
    protected int v2;


    public Objetos(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public String toString() {
        return "(" + this.v1 + "," + this.v2 + ")";
    }
    public void exibe() {
        System.out.println(this);
    }
}
