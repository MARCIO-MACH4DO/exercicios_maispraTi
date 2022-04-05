
import java.util.Scanner;

/**
 *
 * @author Márcio Ilson
 */
public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        double salarioLiquido = 0.00;

        if (salarioBruto < 1100) {
            salarioLiquido = salarioBruto - (salarioBruto * 0.06);
        } else if (salarioBruto <= 2500) {
            salarioLiquido = salarioBruto - (salarioBruto * 0.08);
        } else if (salarioBruto <= 4800) {
            salarioLiquido = salarioBruto - (salarioBruto * 0.1);
        } else {
            salarioLiquido = salarioBruto - (salarioBruto * 0.15);
        }

        System.out.println("Seu salário líquido será: " + salarioLiquido);
        
        scanner.close();
    }

}
