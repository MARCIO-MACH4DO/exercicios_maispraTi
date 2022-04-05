package aula07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Márcio Ilson
 */
public class Aula07 {

    public static void main(String[] args) throws ParseException {
       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data1 = sdf.parse("17/04/2022");
        Date data2 = sdf.parse("20/04/2022");
        
        long diferenca = data2.getTime() - data1.getTime();
        
        int dias = (int) diferenca / (1000 * 60 * 60 * 24);
        
        //Date date = new Date();
        
        //System.out.println(date);
        System.out.println("-----------------");
        System.out.println(data1.getTime());
        System.out.println(" " + sdf.format(data1)); 
        System.out.println(diferenca);
        System.out.println(dias);
    }
    
}
