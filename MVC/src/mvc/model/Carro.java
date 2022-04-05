package mvc.model;

/**
 *
 * @author Márcio Ilson
 */
public class Carro {
    
    private String placa;
    
    private String cor;
    
    private boolean pronto;

    public Carro(String placa, String cor) {
        this.placa = placa;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void verificaSeEstaPronto(){
        if(this.pronto == true){
            System.out.println("Está Pronto");
        }
        else{
            System.out.println("Não está Pronto");
        }
    }
    
    
}
