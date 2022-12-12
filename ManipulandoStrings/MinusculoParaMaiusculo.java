package ManipulandoStrings;

import java.util.Scanner;

public class MinusculoParaMaiusculo {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        String frase = "o rato roeu a roupa do rei de roma";


        frase = frase.replaceAll("o", "O");
        System.out.println(frase);

        entrada.close();


    }
    
}
