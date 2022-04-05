
import java.util.Scanner;

/**
 *
 * @author Márcio Ilson
 */
public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double maiorValor = 0;
        double menorValor = 10000;

        for (int contador = 0; contador < 10; contador++) {
            System.out.println("Digite um valor: ");
            double valorDigitado = scanner.nextDouble();

            if (valorDigitado > maiorValor) {
                maiorValor = valorDigitado;
            }
            if (valorDigitado < menorValor) {
                menorValor = valorDigitado;
            }

        }

        System.out.println("Maior valor digitado: " + maiorValor);
        System.out.println("Menor valor digitado: " + menorValor);
        
    }

}
