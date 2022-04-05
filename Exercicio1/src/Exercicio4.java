
import java.util.Scanner;

/**
 *
 * @author Márcio Ilson
 */
public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codAluno = 0;
        do {
            double media = 0.00;
            double[] notas = new double[3];
            System.out.println("Digite o código do aluno: ");
            codAluno = scanner.nextInt();
            System.out.println("Digite a primeira nota: ");
            notas[0] = scanner.nextDouble();
            System.out.println("Digite a segunda nota: ");
            notas[1] = scanner.nextDouble();
            System.out.println("Digite a terceira nota: ");
            notas[2] = scanner.nextDouble();

            for (double nota : notas) {
                media += nota;
            }

            media = media / 3;

            System.out.println("Média final: " + media);

        } while (codAluno != 0);

        scanner.close();
        
    }

}
