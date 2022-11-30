package ExerciciosMetodos;

import java.util.Scanner;

public class Dio {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        int numero = leitor.nextInt();

        buscar(elementos,numero);
       leitor.close();

    }
    
        
        static void buscar(int vetor[],int numero){
            
            int cont = 0;
            int procura = numero;
            int achei = 0;
            String frase;
            for ( int i = 0 ;i < vetor.length; i++ ) {
                if(procura == vetor[i]){
                    System.out.println("Achei " + procura + " na posicao " + cont);
                    achei = procura;
                    break;
                }
                cont++;
            }
            if (procura != achei){
                System.out.println("Numero nao encontrado");
            }
            
            
             
    }
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

        
    
}
