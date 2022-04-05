package ultimaaula;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Márcio Ilson
 */
public class UltimaAula {

        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Entre com o dia do mês");
            int diaDoMes = sc.nextInt();
            System.out.println("Entre com o número do mês");
            int mes = sc.nextInt();
            System.out.println("Entre com o ano");
            int ano = sc.nextInt();
            
            LocalDate date = LocalDate.of(ano, mes, diaDoMes);
    }
    
}
