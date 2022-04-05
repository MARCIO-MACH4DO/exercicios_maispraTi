package exercicio03;

import exercicio03.model.Calculadora;


/**
 *
 * @author Márcio Ilson
 */
public class Exercicio03 {

    public static void main(String[] args) {
    
        System.out.println(Calculadora.somar(10, 20));
        System.out.println(Calculadora.multiplicar(10, 20));
        System.out.println(Calculadora.subtrair(10, 20));
        System.out.println(Calculadora.dividir(10, 20));
        
        System.out.println(Calculadora.somar(Calculadora.multiplicar(5, 5), Calculadora.dividir(10, 2)));
        
        System.out.println(Calculadora.somar(Calculadora.multiplicar(6, 3), Calculadora.dividir(20, 5)));
    }
    
}
