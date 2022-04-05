package exec03.model;

/**
 *
 * @author Márcio Ilson
 */
public class Contador extends Funcionario {
    
    private final double BONIFICACAO = 0.03;      //Métodos constantes são sempre em letra Maiúscula

    @Override
    public double totalReceber() {
      double valorTotal =  this.getValorHora() * this.getTotalHoras();    
      double bonificacao = valorTotal * this.BONIFICACAO;
    
      return valorTotal+bonificacao;    
     }
    
    public Contador(String nome, double valorHora, double totalHoras) {
        super(nome, valorHora, totalHoras);
    
    }
    
    
    
    
    
    
}
