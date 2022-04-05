
import java.util.Scanner;

/**
 *
 * @author Márcio Ilson
 */
public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorTotal = 0.00;
        boolean continua = true;

        while (continua) {

            System.out.println("O que você deseja?");
            System.out.println("1 - Alaminuta: R$ 24,00");
            System.out.println("2 - Refrigerante: R$ 4,00");
            System.out.println("3 - Xis: R$ 14,00");
            System.out.println("10 - Finalizar pedido");

            int entrada = scanner.nextInt();

            switch (entrada) {
                case 1:
                    valorTotal = valorTotal + 24.00;  // += é igual a valorTotal + 24.00
                    break;
                case 2:
                    valorTotal = valorTotal + 4.00;
                    break;
                case 3:
                    valorTotal = valorTotal + 14.00;
                    break;
                case 10:
                    continua = false;
                    break;
                default:
                    System.out.println("Entrada inválida");

            }

        }

        System.out.println("O valor é: " + "R$ " + valorTotal);
    }
}
