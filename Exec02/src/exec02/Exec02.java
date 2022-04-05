package exec02;

import exec02.model.Animal;
import exec02.model.Cachorro;
import exec02.model.Gato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Márcio Ilson
 */
public class Exec02 {

       public static void main(String[] args) {
        
         List<Animal> animais = new ArrayList<>();
         
          Cachorro cachorro = new Cachorro();
          Gato gato = new Gato();
          
          animais.add(cachorro);
          animais.add(gato);
          
          
          for(Animal animal : animais){
              animal.emitirSom();
          }
          
    }
    
}
