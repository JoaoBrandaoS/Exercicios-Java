package ExercicioRepeticao;

import java.util.Scanner;

public class ParImpar {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de notas: ");
        int quantidade = entrada.nextInt();
        int numero = 0, contadorpar = 0,contadorimpar = 0;

        for(int i = 0; i < quantidade; i++){
            System.out.print("Digite o numero: ");
            numero = entrada.nextInt();

            if(numero % 2 == 0){
                contadorpar += 1;

            } else{
                contadorimpar += 1;
            }
        
        }

        System.out.printf("Quantidade de numeros pares %d | numeros pares: %d",contadorpar,contadorimpar);
       
        entrada.close();

    }

}
