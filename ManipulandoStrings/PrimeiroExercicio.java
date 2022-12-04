package ManipulandoStrings;

import java.util.Scanner;

//Faça um programa que, a partir de uma string digitada pelo usuario,imprima:

/*
 * a) O número de caracteres da string.
 * b) A string com todas suas letras em maiúsculo.
 * c) O número de vogais da string.  
 * d) Se a string digitada começa com “Ola” (ignorando maiúsculas/minúsculas).
 * e) Se a string digitada termina com “Mundo” (ignorando maiúsculas/minúsculas).
 * f) O número de dígitos (0 a 9) da string. 
 * g) Se a string é um palíndromo ou não. 
 */
public class PrimeiroExercicio {


    public static void main(String [] args){
    
        Scanner entrada = new Scanner(System.in);
        String frase = "";
        int ContarVogais = 0;

        System.out.println("Digite uma frase");
        frase = entrada.nextLine();
        
        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
                if(letra == 'a' || letra  == 'e'
                || letra == 'i' || letra  == 'o'
                || letra  == 'u'){
                ContarVogais++;
                }
            }
        
        System.out.println("Letra A: " + frase.length());
        System.out.println("Letra B: " + frase.toUpperCase());        
        System.out.println("letra C: " + ContarVogais);
            
        if(frase.indexOf("ola") > 0){
            System.out.println("Letra D: Sim a frase começa com Olá");
        }else{
            System.out.println("Letra D: Sim a frase não começa com Olá");
        }

        if(frase.indexOf("mundo") > 0){
            System.out.println("letra E: Sim a frase termina com Mundo");
        }else{
            System.out.println("Letra D: Não a frase não termina com Mundo");
        }
        for(int x = 0; x < 9; x++){
            System.out.print(frase.charAt(x));
        }
        entrada.close();

    
}
}
