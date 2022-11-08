package ExercicioRepeticao;

import java.util.Scanner;

public class Fatorial {
    
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero para o fatorial: ");
        float valor = entrada.nextFloat();

        for(float i = valor - 1;i < valor; i--){
            if(i == 0){
                break;
            }
            
            valor *= i;
            
        }
        System.out.print(valor);

        entrada.close();
    }

}
