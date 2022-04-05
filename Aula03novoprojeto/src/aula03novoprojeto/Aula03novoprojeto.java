package aula03novoprojeto;

import aula03novoprojeto.model.Aluno;
import aula03novoprojeto.model.Pedido;
import aula03novoprojeto.model.Professor;

//import aula03novoprojeto.model.*;             *;   importa todas as classes de uma vez


/**
 *
 * @author Márcio Ilson
 */


public class Aula03novoprojeto {

   
    
    public static void main(String[] args) {
      
        /*Pedido pedido01 = new Pedido("João");
        
        //System.out.println(pedido01.getCliente());
        
        String[] itens = new String[10];
        itens[0] = "Lanche";
        itens[1] = "Refri";
        itens[2] = "Pizza";
        
        pedido01.setItens(itens);    
        
        pedido01.setValorTotal(20.0);
        
        pedido01.setStatus("aguardando");
        
        System.out.println(pedido01); */
        
        //System.out.println(pedido01);
        
        //Calculadora.somar(10, 10);
        
        //Contador.incrementa();
                               
       /* Contador contador01 = new Contador();
        contador01.nome = "01";
        Contador contador02 = new Contador();
        contador02.nome = "02";
        
        System.out.println(Contador.PI);
        System.out.println(Math.PI);
        
        
                        
        //System.out.println(contador01.nome + " " + contador01.getValor());
       // System.out.println(contador02.nome + " " + contador01.getValor());

        
      /*  System.out.println(Calculadora.valorInicio);
        
        System.out.println(Math.PI);  
        
        System.out.println(Math.sqrt(25)); */     //  raiz quadrada
        
        
        
        Aluno aluno = new Aluno("Marlon", "202278417", "Porto Alegre");
        Professor professor = new Professor("Rodrigo", "JAVA");
        
        
        aluno.setProfessor(professor);
        
        professor.setAluno(aluno);
        
        System.out.println(aluno);
        
               
        //Calculadora calculadora = new Calculadora();
        
        //calculadora.somar(50, 10);
        
        /*String texto = "Hoje é o dia de JAVA";
        
        System.out.println(texto);
        System.out.println(texto.substring(0, texto.length() -4).length());
        System.out.println(texto.length()); 
        //System.out.println(texto.substring(0, texto.length() -4));
        //System.out.println(texto.substring(0, 4));*/
                                //usado para sabermos o tamanho do nosso texto, (texto.length())
        
    }
    
}

  
    

