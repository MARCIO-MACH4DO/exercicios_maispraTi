package aula03.model;

import java.util.Objects;

/**
 *
 * @author Márcio Ilson
 */
public class Jogador {
    private  String nome;    
    private int qtGol;
    private  int qtAssistencia;

    public Jogador() {
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtGol() {
        return qtGol;
    }

    public void setQtGol(int qtGol) {
        this.qtGol = qtGol;
    }

    public int getQtAssistencia() {
        return qtAssistencia;
    }

    public void setQtAssistencia(int qtAssistencia) {
        this.qtAssistencia = qtAssistencia;
    }

    
    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (this.qtGol != other.qtGol) {
            return false;
        }
        if (this.qtAssistencia != other.qtAssistencia) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }*/
    

    
    
}
