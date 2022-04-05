package exec03;

import exec03.model.Administrador;
import exec03.model.Contador;
import exec03.model.Programador;

/**
 *
 * @author Márcio Ilson
 */
public class Exec03 {

    public static void main(String[] args) {
       
       Programador programador = new Programador("Márcio Machado", 40.0, 300.0); 
       Administrador administrador = new Administrador("Rodrigo Losina", 50.0, 200.0);
       Contador contador = new Contador("Marlon Eduardo", 80.0, 130.0);
        System.out.println("Nome=" + programador.getNome() + " Total a Receber=" + programador.totalReceber());
        System.out.println("Nome=" + administrador.getNome() + " Total a Receber=" + administrador.totalReceber());
        System.out.println("Nome=" + contador.getNome() + " Total a Receber=" + contador.totalReceber());
    }
    
}
