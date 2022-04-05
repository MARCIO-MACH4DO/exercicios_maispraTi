package aula02exe02;

import aula02exe02.model.Aluno;

/**
 *
 * @author Márcio Ilson
 */
public class Aula02Exe02 {

   
    public static void main(String[] args) {
      
        //estamos instanciando a classe Aluno,  Aluno aluno = new Aluno();
        Aluno aluno = new Aluno("Marlon", 35.00, 35.00, 35.00);
        
        //System.out.println(aluno.nota1);
        System.out.println(aluno.nota1);
        
        aluno.adicionaNotas(30.00, 35.00, 35.00);
        
       // System.out.println(aluno.nota1); retirei para colocar aluno.retornaInfo();
        
        aluno.retornaInfo();
        
    }
    
}
