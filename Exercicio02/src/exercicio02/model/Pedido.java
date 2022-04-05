package exercicio02.model;

import exercicio02.enuns.Status;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Márcio Ilson
 */
public class Pedido {
    
    private List<String> itens = new ArrayList<String>();
    
    private Status status;
    
    private double valorTotal;

    public Pedido() {
        this.status = Status.AGUARDANDO;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(String item) {
        this.itens.add(item);
    }
    
    
     public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    public void addItens(String item, double valor){
        
        setItens(item);
        setValorTotal(getValorTotal() + valor);
        //this.itens.add(item);
            
        //setItens(itens);
        //setValorTotal(valor + getValorTotal());
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "itens=" + getItens() + ", status=" + status + ", valorTotal=" + valorTotal + '}';
        //return "Pedido{" + "itens=" + itens + ", status=" + status + ", valorTotal=" + valorTotal + '}';
    }
    
    /*private String[] itens = new String[10];
    
    private Status status;
    
    private double valorTotal;

    public Pedido() {
        this.status = Status.AGUARDANDO;
    }
    
    

    public String[] getItens() {
        return itens;
    }
    

    public void setItens(String[] itens) {
        this.itens = itens;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    
    public String retornaItensConcatenados(){
        String itens = "";
        for(int i = 0; i < this.itens.length; i++){
            if(this.itens[i] != null){
                itens += this.itens[i] + ", ";
           }
        }
        return itens.substring(0, itens.length() -2);
    }
    
    
    
    public void addItens(String item, double valor){
        String[] itens = getItens();
        
        for(int i = 0; i < itens.length; i++){
            if(itens[i] == null){
                itens[i] = item;
                setValorTotal(valor + getValorTotal());  
                break;
            }
        }
        setItens(itens);
        //setValorTotal(valor + getValorTotal());
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "itens=" + retornaItensConcatenados() + ", status=" + status + ", valorTotal=" + valorTotal + '}';
        //return "Pedido{" + "itens=" + itens + ", status=" + status + ", valorTotal=" + valorTotal + '}';
    } */

    
    }
    
    
    
