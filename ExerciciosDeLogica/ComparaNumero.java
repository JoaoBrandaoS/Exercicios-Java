package ExerciciosDeLogica;

import java.util.Scanner;

public class ComparaNumero {
    
    /*Escreva um programa que leia dois números e exiba mensagem informando o
valor do maior número e o valor do menor número. Se os dois números forem
iguais, o programa deve exibir mensagem informando este fato */
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        double numero = entrada.nextDouble();

        System.out.print("Digite outro numero: ");
        double numero2 = entrada.nextDouble();

        if(numero > numero2){
            System.out.println("O primeiro numero digitado é maior!!\n este numero é: " + numero);

        }else if(numero2 > numero){
            System.out.println("O segundo numero digitado é maior!!\n este numero é: " + numero2);
        }else {
            System.out.println("Os numeros são iguais!!\no primeiro numero é: " + numero + "\nsegundo numero é: " + numero2);
        }

        entrada.close();

    }

}
