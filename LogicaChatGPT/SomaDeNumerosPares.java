package LogicaChatGPT;

import java.util.Scanner;

public class SomaDeNumerosPares {
    

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero:");
        int numero = entrada.nextInt();
        int soma = 0;

        for(int i = 2; i <= numero; i++){
            soma = (i % 2 == 0) ? soma += i : soma + 0;
        }
        System.out.println("A soma dos números pares menores ou iguais a " + numero + " é " + soma);
        
        entrada.close();
    }

}
