package ManipulandoStrings;

import java.util.Scanner;

public class TamanhoDaString {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();

        System.out.printf("O tamanho da frase é: %d",frase.length());

        entrada.close();

    }
    
}
