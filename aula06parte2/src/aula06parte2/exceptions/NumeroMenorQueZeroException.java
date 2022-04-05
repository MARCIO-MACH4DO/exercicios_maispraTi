package aula06parte2.exceptions;

/**
 *
 * @author Márcio Ilson
 */
public class NumeroMenorQueZeroException extends Exception{
    
    public NumeroMenorQueZeroException(String msg){
        super(msg);
    }
    public NumeroMenorQueZeroException(String msg, Throwable causa){
        super(msg, causa);
    }
    
}
