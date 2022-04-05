package aula2.model;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Márcio Ilson
 */
/* public class Pedido {

    public String cliente;
    public double valor;
    public String[] itens = new String[2];

    public Pedido(String cliente, double valor, String item1, String item2){
        this.cliente = cliente;
        this.valor = valor;
        this.itens[0] = item1;
        this.itens[1] = item2;
    }
    
    public String mensagemFinal() {
        String texto = "O cliente " + cliente + " fez uma compra de "
                + valor + " e os itens eram: " + itens[0] + " , " + itens[1];
        
        return texto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
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
        final Pedido other = (Pedido) obj;
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Arrays.deepEquals(this.itens, other.itens)) {
            return false;
        }
        return true;
    }
    
    
    
}*/
 /* Marlon continuou a partir de 1:09:00 do video a fazer novas versões do código*/
public class Pedido {

    public String cliente;
    public double valor;
    public String[] itens = new String[5];

    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    /* public String mensagemFinal() {
        String texto = "O cliente " + cliente + " fez uma compra de "
                + valor + " e os itens eram: " + itens[0] + " , " + itens[1];
        return texto; */
 /*
    public String mensagemFinal() {
        String texto = "O cliente " + cliente + " fez uma compra de "
                + valor + " e os itens eram: " + itens[0] + ", " + itens[1]
                + ", " + itens[2]
                + ", " + itens[3]
                + ", " + itens[4];

        return texto;
    
    }
     */
    //Essa função vai receber um item e o valor do item e modificar a classe
    public void recebeItemValor(String item, double valor) {
        this.valor += valor;

        for (int i = 0; i < this.itens.length; i++) {
            if (this.itens[i] == null) {
                this.itens[i] = item;
                break;
            }

        }

    }

    // retornaItens - é o meu método
    public String retornaItens() {                                                 
        String itensLista = "";
        for (String item : this.itens) {
            itensLista += item + ", ";
        }
        itensLista = itensLista.substring(0, itensLista.length() -2);
        return itensLista;
     // Essa função retorna os itens em linha e "come" a vírgula final Ex.: substring(0, itensLista.length() -2)     
    }

    @Override  //Esse é o método toString()
    public String toString() {
        return "O (A)" + "cliente " + cliente + ", comprou " + retornaItens() + " e o valor=" + valor;
     // return "Pedido{" + "cliente=" + cliente + ", valor=" + valor + ", itens=" + retornaItens() + '}';
     // return "Pedido{" + "cliente=" + cliente + ", valor=" + valor + ", itens=" + itens + '}';
    }

}
