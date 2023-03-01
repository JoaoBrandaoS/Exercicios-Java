package LogicaChatGPT;

import java.util.Scanner;

public class SomaDeNumerosImpares {
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero positivo: ");
        int numero = entrada.nextInt();
        int soma = 0;

        for(int i = 0; i <= numero; i++){
            soma = (i % 2 != 0) ? soma += i : soma + 0 ;
        }
        
        System.out.println("A soma dos " + numero + " números impares positivos é: " + soma);

        entrada.close();
    }

}
