package ExerciciosDeLogica;

import java.util.Scanner;

public class VerificaCaso {

    /*Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código
é igual a 1, igual a 2 ou igual a 3. Caso não seja, apresentar a mensagem “Código inválido”.
Ao ser verificado o código e constatado que é um valor válido, o programa deve verificar cada
código em separado para determinar seu valor por extenso, ou seja, apresentar a mensagem
“um”, ”dois” ou “três”. (Utilizar o comando Switch). */

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite um numero entre 1 e 3: ");
        int numero = entrada.nextInt();

        switch(numero){
           case 1: 
                System.out.println("Um");
                break;
        
            case 2:
                System.out.print("Dois");
                break;
            case 3:
                System.out.println("Treis");
                break;
            default:
                System.out.print("numero invalido");
                

        }
        entrada.close();
    }
    
}
