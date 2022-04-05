package exercicio1;


import java.util.Scanner;

/**
 *
 * @author Márcio Ilson
 */
public class Exercicio2 {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in); 
       System.out.println("Digite o valor de maçãs compradas: ");
       int macasCompradas = scanner.nextInt();
        
       double total = 0.00;
       
        if(macasCompradas < 12) {
            total = macasCompradas * 0.30;
        } else {
           total = macasCompradas * 0.25; 
        }
       
       System.out.println("Total de maçãs compradas: " + macasCompradas + 
                            ", valor total: " + total);
       
      scanner.close();  
    }
 }


    

