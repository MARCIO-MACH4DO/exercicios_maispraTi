package aula2;

import aula2.model.Pedido;

/**
 *
 * @author Márcio Ilson
 */
public class Aula2 {

    public static void main(String[] args) {
        /*
        String clientePedido01 = "João";
        double valorPedido01 = 25.00;
        String[] itensPedido01 = {"Refrigerante", "Xis"};

        String clientePedido02 = "Maria";
        double valorPedido02 = 25.00;
        String[] itensPedido02 = {"Refrigerante", "Xis"};

        System.out.println("O cliente " + clientePedido01 + " fez uma compra de "
                + valorPedido01 + " e os itens eram: " + itensPedido01[0]
                + ", " + itensPedido01[1]);
        
         */

 /*Pedido pedido01 = new Pedido("João", 25.00, "Refrigerante", "Xis");

        System.out.println(pedido01.mensagemFinal());*/
        /* Pedido pedido01 = new Pedido("João");

        System.out.println(pedido01.mensagemFinal());

        pedido01.recebeItemValor("Refrigerante", 5.00);
        pedido01.recebeItemValor("Xis", 25.00);
        pedido01.recebeItemValor("Alaminuta", 25.00);
        pedido01.recebeItemValor("Suco", 5.00);
        pedido01.recebeItemValor("Água", 2.00);
        

        System.out.println(pedido01.mensagemFinal()); */

        /*Pedido pedido02 = new Pedido();
        pedido02.cliente = "Maria";
        pedido02.valor = 30.00;
        pedido02.itens[0] = "Alaminuta";
        pedido02.itens[1] = "Suco";*/
        //System.out.println(pedido02.mensagemFinal());
        
        
       /* Pedido pedido01 = new Pedido ("João");
        
        System.out.println(pedido01.mensagemFinal());
        
        pedido01.recebeItemValor("Refrigerante", 5.00);
        
        System.out.println(pedido01.mensagemFinal()); */
       
       Pedido pedido01 = new Pedido("João");

        System.out.println(pedido01.toString());

        pedido01.recebeItemValor("Refrigerante", 5.00);
        pedido01.recebeItemValor("Xis", 25.00);
        pedido01.recebeItemValor("Alaminuta", 25.00);
        pedido01.recebeItemValor("Suco", 5.00);
        pedido01.recebeItemValor("Água", 2.00);
        

        System.out.println(pedido01.toString());
        
        //System.out.printf("O valor total é R$ %.2f", pedido01.valor);
        System.out.printf("O valor total é R$ %.2f \n", pedido01.valor);  // O println quebra uma linha \n  
    }

        
    
    
}
