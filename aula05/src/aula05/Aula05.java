package aula05;

import aula05.model.Analista;
import aula05.model.Coordenador;
import aula05.model.Funcionario;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Márcio Ilson
 */
public class Aula05 {

    public static void main(String[] args) {
        
       /* ArrayList<String> lista = new ArrayList<String>();
        //List lista = new ArrayList<String>();
        LinkedList<String> lista2 = new LinkedList<String>();
        
        HashSet<String> lista3 = new HashSet<String>();*/
        
        
      List<Funcionario> lista = new ArrayList<>();
      List<Coordenador> lista2 = new ArrayList<>();
        
       Funcionario analista = new Analista(1 , "Pyetro", "pyetro@gmail.com");
       Funcionario analista2 = new Analista(2 , "Mystica", "mystica@gmail.com");
       Funcionario analista3 = new Analista(3 , "Scarlate", "scarlate@gmail.com");
       Analista analista4 = new Analista(4 , "Magneto", "magneto@gmail.com");  
       Coordenador coordenador = new Coordenador(5 , "Vampira", "vampira@gmail.com", "TI");
       
        lista.add(analista);
        lista.add(analista2);
        lista.add(analista3);
        lista.add(analista4);
        lista.add(coordenador);
        
       lista2.add(coordenador);
        
       lista.forEach(f -> System.out.println(f));
       lista2.forEach(f -> System.out.println(f.getDepartamento()));
       
       
       //Funcionario funcionario = new Funcionario();
       //Analista analista = new Analista();
       // Analista analista = new Analista(1 , "Pyetro", "pyetro@gmail.com");
        //Funcionario analista = new Analista(1 , "Pyetro", "pyetro@gmail.com");
       // Funcionario funcionario = new Funcionario(2 , "Scarlate", "scarlate@gmail.com");
        //analista.inserirNome("Márcio", "Machado");
        
        //System.out.println(analista.getSobrenome());
        //System.out.println(analista.getNome());
        /*analista.setTeste("Olha eu aqui testando o teste, ");
        funcionario.setTeste("Texto +");
        //System.out.println(analista.getTeste());
        System.out.println(analista);
        System.out.println(funcionario);*/
        
       // analista.setNome("Rodrigo");
        //funcionario.setNome("Marlon");
        
       // analista.setEquipamento("Computador");
        
       /* System.out.println(analista.getNome());
        System.out.println(analista.getEmail());
        System.out.println(analista.getCodigo());*/
       // System.out.println(funcionario.getNome());
       // System.out.println(analista.getEquipamento());
        
        
      /* lista.add("Márcio");
       lista.add("Ilson");
       lista.add("Scooby");
       lista.add("Fred");
       lista.add("Daphine");
       lista.add("Salsicha");
       
       lista2.add("Velma");
       lista2.add("Scoby-loo");
       lista2.add("She-ra");
       lista2.add("He-man");
       lista2.add("Lion");
       lista2.add("Chetara");
       
       lista3.add("Jade");
       lista3.add("Lucas");
       lista3.add("Zoraide");
       lista3.add("Said");
       lista3.add("Maisa");
       lista3.add("Leonidas");
       lista3.add("Yvete");
       
        System.out.println(lista.get(2));
        //System.out.println(lista);
        System.out.println(lista.size());
        
        System.out.println(lista.isEmpty());
        
        System.out.println(lista2.get(2));
        
        System.out.println(lista2.getFirst());
        
        System.out.println(lista2.getLast());
        
        System.out.println(lista2);
                       
        System.out.println(lista3); */
        
        
    }
    
}

