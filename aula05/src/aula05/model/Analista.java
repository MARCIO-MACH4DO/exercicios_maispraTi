package aula05.model;

/**
 *
 * @author Márcio Ilson
 */
public class Analista extends Funcionario{
    
    String equipamento;
    
    public Analista(int codigo, String nome, String email){
        super(codigo, nome, email);
        
        /*this.nome = nome;
        this.codigo = codigo;
        this.email = email;*/
    }
    

   /* public int getCodigo() {                  Tudo isso da linha 20 até a linha 65 - já tem na classe pai Funcionario
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

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
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
    } */

   /* @Override
    public String toString() {
        return "Analista{" + "equipamento=" + equipamento + '}';
    }*/

    
    @Override
    public void setTeste(String teste) {
        this.teste = teste + "Denovo testando o teste na classe filha Analista";
    }

    public String getTeste() {
        return teste;
    }
     
        
   @Override
    public String toString() {
        return super.toString() + " Analista{" + "equipamento=" + equipamento + '}';
    }
    
    
}
