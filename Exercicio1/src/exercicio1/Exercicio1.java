package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Márcio Ilson
 */
public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int valor2 = scanner.nextInt();

        if(valor1 > valor2) {
            System.out.println(valor1);
        } else {
            System.out.println(valor2);
        }

        scanner.close();
    }

}
