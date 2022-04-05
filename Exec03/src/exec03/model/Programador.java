package exec03.model;

/**
 *
 * @author Márcio Ilson
 */
public class Programador extends Funcionario{

    private final double BONIFICACAO = 0.05;      //Métodos constantes são sempre em letra Maiúscula
    
    
    @Override
    public double totalReceber() {
    double valorTotal =  this.getValorHora() * this.getTotalHoras();    
    double bonificacao = valorTotal * this.BONIFICACAO;
    
    return valorTotal+bonificacao;
    }

    public Programador(String nome, double valorHora, double totalHoras) {
        super(nome, valorHora, totalHoras);
    }

    
}
