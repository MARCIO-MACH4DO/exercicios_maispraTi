package aula05.model;

/**
 *
 * @author Márcio Ilson
 */
public class Coordenador extends Funcionario{

    String departamento;

       
    public Coordenador(int codigo, String nome, String email, String departamento) {
        super(codigo, nome, email);
        this.departamento = departamento;
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
   
    
}
