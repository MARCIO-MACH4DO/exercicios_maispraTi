package aula06parte2.model;

import aula06parte2.exceptions.NaoTemALetraAException;
import aula06parte2.exceptions.NumeroMenorQueZeroException;

/**
 *
 * @author Márcio Ilson
 */
public class Calculadora {
    
   public void somar(int valor1, int valor2) throws NumeroMenorQueZeroException{
        if(valor1 < 0 || valor2 < 0){
            throw new NumeroMenorQueZeroException("Número menor que 0");
        }
        
        System.out.println(valor1 + valor2);
    }
    
    public void verificaSeTemA(String nome){
        
        if(!nome.contains("a")){
           throw new NaoTemALetraAException("Não contém a letra a"); 
        }
        System.out.println("Não contém a letra a");
    }

    
    }
