package ExerciciosDeLogica;

import java.util.Scanner;

public class NumeroPositivo {
    /*Faça um programa que leia um número inteiro e mostre uma mensagem na tela
indicando se este número é positivo ou negativo. Pare a execução do programa
quando o usuário requisitar. */
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        
        double numero = 0;
        do {

        System.out.print("Digite um numero: ");
         numero = entrada.nextDouble();

        if(numero > 0){
            
            System.out.println("Numero positivo");

        }else{
            System.out.println("numero negativo");
        }
    }while (numero ==0);
        entrada.close();
    } 

}
