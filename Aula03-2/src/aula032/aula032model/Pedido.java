package aula032.aula032model;

import aula032.aula032model.aula032modelenuns.Status;

/**
 *
 * @author Márcio Ilson
 */
public class Pedido {
    
    private String[] itens = new String[10];
    
    private double valorTotal;
    
    private String cliente;
    
    public Status status;

    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    public String getItens() {
        String itensConcatenados = "";
        
        for(String item : itens) {
          if(item != null)
            itensConcatenados += item + ", ";
        }
        return itensConcatenados.substring(0, itensConcatenados.length() -2);
    }

    public void setItens(String[] itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Status getStatus() {
        return status;
    }

   // public void setStatus(Status status) {
    public void setStatus(String status) {
        this.status = Status.valueOf(status.toUpperCase());
    }
    
    

    @Override
    public String toString() {
        return "Pedido{" + "itens = " + getItens() + ", valorTotal = " + valorTotal + ", cliente = " + cliente + ", Status: " + status + '}';
       // return "Pedido{" + "itens = " + getItens() + ", valorTotal = " + valorTotal + ", cliente = " + cliente + '}';
    }
    
    
    
}
