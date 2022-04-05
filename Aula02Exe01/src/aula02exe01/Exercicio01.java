package aula02exe01;

import aula02exe01.model.Jogador;

/**
 *
 * @author Márcio Ilson
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Jogador jogador01 = new Jogador("CR7");
        jogador01.adicionaGol(2);
        jogador01.adicionaAssistencia(1);

        Jogador jogador02 = new Jogador("Messi");
        jogador02.adicionaGol(3);

        if (jogador01.retornaGols() > jogador02.retornaGols()) {
            System.out.println("O jogador " + jogador01.nome + " fez mais gols!");
        } else {
            System.out.println("O jogador " + jogador02.nome + " fez mais gols!");
            
       
          if (jogador01.retornaAssistencias() > jogador02.retornaAssistencias()) {
            System.out.println("O jogador " + jogador01.nome + " fez mais assistências!");
        } else {
            System.out.println("O jogador " + jogador02.nome + " fez mais assistências!");   
            
            
        }

    }

}
}
