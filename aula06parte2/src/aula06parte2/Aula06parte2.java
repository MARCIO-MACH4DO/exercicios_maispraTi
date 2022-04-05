package aula06parte2;

import aula06parte2.exceptions.NumeroMenorQueZeroException;
import aula06parte2.model.Calculadora;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author Márcio Ilson
 */
public class Aula06parte2 {

   
    public static void main(String[] args) throws ParseException {
        
       /* Calculadora calculadora = new Calculadora();
        calculadora.verificaSeTemA("b");
        
       try{
           calculadora.somar(-3, 2);
       }catch(NumeroMenorQueZeroException e){
           System.out.println(e.getMessage());
       }
       /*Calculadora calculadora = new Calculadora();
       try{
           calculadora.somar(2, 2);
       }catch(Exception e){
           
       }*/
        
       Date agora = new Date();
       LocalDate localdate = LocalDate.now();
       //LocalDate localdate2 = LocalDate.of(22, Month.MARCH, 2022);
       
       //int diferenca = localdate2.getDayOfMonth() - localdate.getDayOfMonth();  //Marlon nãosoube fazer deu ERRADO
       
        //System.out.println(diferenca);
       
      //SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
       SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       
       
       
       //Date date = format.parse("04/04/2022");
       Date date = format.parse("04/04/2022 18:00:15");
       
       Date date2 = new Date("24/10/2011");
       
        System.out.println(agora);
       System.out.println(date);
       System.out.println(date2);
    }
    
}
