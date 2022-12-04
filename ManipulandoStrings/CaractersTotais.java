package ManipulandoStrings;

import java.util.Scanner;

public class CaractersTotais {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        String frase = "";

        System.out.println("Digite uma frase");
        frase = entrada.nextLine();

        String [] palavras = frase.split(" ");
        System.out.println("Tamanho da string é: " + frase.length() + "\nA quantidade de palavras é: " + palavras.length);
        

        entrada.close();

    }

}
