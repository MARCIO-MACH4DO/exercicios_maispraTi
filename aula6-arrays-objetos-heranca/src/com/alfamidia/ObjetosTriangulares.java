package com.alfamidia;

/**
 * Created by Márcio Ilson on 09/03/2022.
 */
public class ObjetosTriangulares extends Objetos {
    public int v3;

    public ObjetosTriangulares(int v1, int v2, int v3) {
        super(v1, v2);
        this.v3 = v3;
    }

    public String toString() {
        return "(" + this.v1 + "," + this.v2 + "," + this.v3 + ")";
    }
   /* public void exibe() {
        System.out.println(this);   - Não precisamos mais desse exibe
    }*/
}
