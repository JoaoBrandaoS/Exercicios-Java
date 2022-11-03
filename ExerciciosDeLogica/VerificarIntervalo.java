package ExerciciosDeLogica;

import java.util.Scanner;

/*Escreva um programa que leia um número inteiro. Verificar por meio de condição se o
valor fornecido está na faixa entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da
faixa, apresentar a mensagem “valor válido”. Caso contrário, apresentar a mensagem “valor
inválido”. */

public class VerificarIntervalo {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        if(numero >=0 && numero <=9){
            System.out.println("Numero valido!");

        }else {
            System.out.println("numero invalido!");
        }

        entrada.close();

    }
    
}
