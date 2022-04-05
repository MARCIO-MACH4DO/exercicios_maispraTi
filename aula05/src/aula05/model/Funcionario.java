package aula05.model;

/**
 *
 * @author Márcio Ilson
 */
public abstract class Funcionario {             // abstract foi adicionado 
    
    protected int codigo;
    //protected Long codigo;
    
    protected String nome;
    
    protected String email;
    
    protected String sobrenome;
    
    protected String teste;
    
    public Funcionario(int codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }
    
    
        
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void inserirNome(String nome, String sobrenome) {          //public String getSobrenome
        //return sobrenome;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

     
    
   /* @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", nome=" + nome + ", email=" + email + '}';
    }*/

    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", sobrenome=" + sobrenome + ", teste=" + teste + '}';
    }
    
    
}
