package aula02exe02.model;

/**
 *
 * @author Márcio Ilson
 */
public class Aluno {
    
    public String nome;
    
    public double nota1;
    public double nota2;
    public double nota3;
    
  //nosso construtor é vazio, public Aluno ()  
    public Aluno() {
        
    }
    
    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        
        double soma = nota1 + nota2 + nota3;  //declarei a variável soma
        
        if(soma > 100) {
            System.out.println("Atenção, o somatório é maior que 100. "
                            + "Adicione as notas novamente");
        }else{
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }
        
        
       /* Colocamos tudo dentro do else
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3; */
     }
    
    //criado método se for maior que 100 - public void adicionaNotas()
     public void adicionaNotas(double nota1, double nota2, double nota3) {
         double soma = nota1 + nota2 + nota3;  //declarei a variável soma
        
        if(soma > 100) {
           System.out.println("Atenção, o somatório é maior que 100. "
                            + " Tente novamente");
        }else{
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }  
                
     }
        
     public void retornaInfo() {
            System.out.println(this.nome);
            System.out.println("Maior Nota: " + retornaMaiorNota()
                   + " Menor Nota: " + retornaMenorNota());
            
            System.out.printf("Média: %.2f \n", retornaMedia());    //desse jeito o retornaMedia() fica com só 2 casas decimais
            //  \n - server para pular uma linha
           /* System.out.println(this.nome + " média: " + retornaMedia() + 
                   " maior nota: " + retornaMaiorNota()
                   + " menor nota: " + retornaMenorNota());*/
     }
     
     public Double retornaMedia() {
         double media = 0;
         if(this.nota1 >= 0 && this.nota2 >= 0 && this.nota3 >= 0) {
            media = (this.nota1 + this.nota2 + this.nota3) / 3;
         }
         return media;
     }
    
     public Double retornaMenorNota() {
         double menorNota = 0;
         if(this.nota1 < this.nota2 && this.nota1 < this.nota3) {
             menorNota = this.nota1;
         }else if(this.nota2 < this.nota1 && this.nota2 < this.nota3) {
             menorNota = this.nota2;
         }else {
             menorNota = this.nota3;
         }
         
         return menorNota;
     }
     
     public Double retornaMaiorNota() {
         double maiorNota = 0;
         if(this.nota1 > this.nota2 && this.nota1 > this.nota3) {
             maiorNota = this.nota1;
         }else if(this.nota2 > this.nota1 && this.nota2 > this.nota3) {
             maiorNota = this.nota2;
         }else {
             maiorNota = this.nota3;
         }
         
         return maiorNota;
     }
     
}

