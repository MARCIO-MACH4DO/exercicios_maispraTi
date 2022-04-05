package aula06parte2.exceptions;

/**
 *
 * @author Márcio Ilson
 */
public class NaoTemALetraAException extends RuntimeException{     // RuntimeException
   
   public NaoTemALetraAException (String msg){
       super(msg);
   }
}
