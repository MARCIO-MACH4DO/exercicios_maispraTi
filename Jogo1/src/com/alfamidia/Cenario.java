package com.alfamidia;

/**
 * Created by Márcio Ilson on 13/03/2022.
 */
public class Cenario {
    int[][] mapa;
    String[] desenhos;
    Pecas[] inimigos;
    int pecasRestantes;
    int tirosRestantes;

    public Cenario() {
        this.pecasRestantes = 5;
        this.tirosRestantes = 25;
        this.mapa = new int[10][10];
       // this.desenhaLinha(this.mapa[0]); esta linha foi apagada após ser feito  public void desenhaCenario() {.......
       /* this.mapa[1][1] = 1;
          this.mapa[2][2] = 2;*/
        this.desenhos = new String[] {".","X","*"};  // aqui já estamos criando um Array preenchido com 3 elementos
         this.inimigos = new Pecas[this.pecasRestantes];      //Nós vamos instancia-lo
        for(int i = 0; i < this.pecasRestantes; i++) {
            this.inimigos[i] = new Pecas();
        }

    }

    public void desenhaLinha(int[] linha) {

        String strLinha = "";
        for( int celula: linha) {
           // strLinha += celula;
            strLinha += this.desenhos[celula] + " ";
        }
        System.out.println(strLinha);
    }

    public void desenhaCenario() {
        for(int[] linha: this.mapa) {
        this.desenhaLinha(linha);
        }

        /*for(int i = 0; i < 5; i++) {
            System.out.println((i+1) + "(" + this.inimigos[i].x + "," + this.inimigos[i].y + ")");
        }*/

        System.out.println("Peças Restantes: " + this.pecasRestantes);
        System.out.println("Tiros Restantes: " + this.tirosRestantes);

    }


    public boolean disparo(int x, int y) {
        this.tirosRestantes--;
        double distancia = 100;
        double d1 = 0;

        for( Pecas p: inimigos) {
            if (p.isVivo()) {
                d1 = p.disparo(x, y);
                if (d1 == 0) {
                    this.pecasRestantes--;
                }
                distancia = (d1 < distancia) ? d1 : distancia;

          /*  if (d1 < distancia) {
                distancia = d1;
            }*/
            }
        }
        System.out.println("====================================");
        System.out.println("Distância é: " + distancia);
        System.out.println("====================================");
        /*if (distancia == 0) {
            this.pecasRestantes--;
        }*/
        this.mapa[y][x] = (distancia>0)?1:2;

        return ((this.pecasRestantes > 0) && (this.tirosRestantes > 0));
    }

}
