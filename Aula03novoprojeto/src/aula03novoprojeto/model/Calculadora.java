package aula03novoprojeto.model;

/**
 *
 * @author Márcio Ilson
 */
public class Calculadora {
    
     public static double valor;
    
   // public final double valorInicio = 10;
    
    //public static double valorInicio = 10;
    
    public static void somar(int valor1, int valor2) {
        System.out.println(valor1 + valor2);
    }
    private double valorInicio;
    
    public void alteraValor(double valor) {
        this.valorInicio = valor;
    }
    
}
