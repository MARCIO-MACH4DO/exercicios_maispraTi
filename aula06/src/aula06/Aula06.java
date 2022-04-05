package aula06;

import aula06.model.Circulo;
import aula06.model.Forma;
import aula06.model.Retangulo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Márcio Ilson
 */
public class Aula06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String idade = null;
        try {
            
            List<String> nomes = new ArrayList<>();
            
            /*if(sc.hasNext()){               //Marlon não soube explicar o sc.hasNext()
                
            }*/
            
            nomes.add("She-ra");
            nomes.add("Felina");
            nomes.add("Wanda Vision");
            
            
            String[] array = new String[3];

            array[0] = "Teste";
            array[1] = "Teste2";
            array[2] = "Teste3";

            
            System.out.println(array[1]);
            //System.out.println(nomes.get(5));
            
            System.out.println(idade.toLowerCase());
            //System.out.println(array[0]);
            //System.out.println(array[2]);
           // System.out.println(array[3]);

            //try{
            System.out.println("Digite um número: ");
            int valor1 = sc.nextInt();

            //System.out.println(valor1);
        } catch (InputMismatchException excep1) {                                //catch() - ele captura uma exceção
            System.out.println("Número inválido!");
            //e.printStackTrace();                           e.printStackTrace(); --- Mostra o caminho do meu Erro
            //System.out.println("Número inválido!" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException excep2) {
            System.out.println("Posição inexistente");
        }catch (IndexOutOfBoundsException excep3) {
            System.out.println("Posição inexistente");
        }catch (NullPointerException excep4) {
            System.out.println("Palavra nula");
        }finally{
            System.out.println("Sempre ocorrerá");
        }

        sc.close();

        /* Retangulo retangulo = new Retangulo(100,100);
        Circulo circulo = new Circulo(50);
        
        List<Forma> formas = new ArrayList<>(); 
        
        System.out.println(retangulo.area());
        System.out.println(circulo.area());*/
 /*formas.add(retangulo);
        formas.add(circulo);
        System.out.println("==================================");
        System.out.println(formas.get(0));*/
 /*formas.add(retangulo);
        formas.add(circulo);
        System.out.println("----------------------------------------");
        circulo.sejaCriativo();*/
    }

}
