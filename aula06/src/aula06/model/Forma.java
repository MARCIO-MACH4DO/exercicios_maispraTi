package aula06.model;

/**
 *
 * @author Márcio Ilson
 */
public interface Forma {
    
    public double area();
    
    default void sejaCriativo(){
        System.out.println("Funcionou");
    }
    
}
