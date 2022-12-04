package ManipulandoStrings;

import java.util.Scanner;

/*Faça um programa que, a partir de um texto digitado pelo usuário, 
imprima o texto  removendo todos os espaços em branco adicionais encontrados,
de modo que haja, no  máximo, um espaço em branco separando as palavras
presentes nesse texto. */

public class ApagandoEspaco {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        String frase = "";

        System.out.println("Digite uma frase: ");
        frase = entrada.nextLine();
        
        System.out.println(frase.trim());

        entrada.close();

    }
}
