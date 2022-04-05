package aula02exe01.model;

/**
 *
 * @author Márcio Ilson
 */
public class Jogador {
    public String nome;    
    public int qtGol;
    public int qtAssistencia;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public void adicionaGol(int qtGol){
        this.qtGol += qtGol;
    }
    
      public void adicionaAssistencia(int qtAssistencia){
        this.qtAssistencia += qtAssistencia;
    }
    
    public int retornaGols(){
        return this.qtGol;
    }
    
    public int retornaAssistencias(){
        return this.qtAssistencia;
    }
    
}
