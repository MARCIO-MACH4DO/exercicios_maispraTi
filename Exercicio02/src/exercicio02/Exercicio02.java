package exercicio02;

import exercicio02.model.Pedido;

/**
 *
 * @author Márcio Ilson
 */
public class Exercicio02 {

       public static void main(String[] args) {
       
           Pedido pedido01 = new Pedido();
           
          // System.out.println(pedido01);
           
          /* pedido01.addItens("Lampada", 15);
           pedido01.addItens("Chuveiro", 50);
           pedido01.addItens("Mesa", 315);
           pedido01.addItens("Cadeira", 215); */
          
           pedido01.addItens("Lampada", 15);
           pedido01.addItens("Chuveiro", 50);
           pedido01.addItens("Mesa", 315);
           pedido01.addItens("Cadeira", 215);
           pedido01.addItens("Tapete", 150);
           pedido01.addItens("Cortina", 90);
           pedido01.addItens("Rack", 185);
           pedido01.addItens("Sapateira", 250);
           pedido01.addItens("Ventilador", 170);
           pedido01.addItens("Sofá", 500);
           pedido01.addItens("Pia Inox", 485);
           pedido01.addItens("Guarda-Roupa", 640);
           pedido01.addItens("Cama", 850);
           pedido01.addItens("Estante", 700);
           pedido01.addItens("Abajur", 160);
           pedido01.addItens("Chaleira", 95);                     
           
           System.out.println(pedido01);
           //System.out.println(pedido01.getItens().length);
           
           
    }
    
}
