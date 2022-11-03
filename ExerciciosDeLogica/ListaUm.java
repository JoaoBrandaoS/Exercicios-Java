package ExerciciosDeLogica;
import java.util.Scanner;
import java.util.Arrays;

public class ListaUm {

    /*1-Escreva um programa que leia 3 números inteiros e imprima na tela os
valores em ordem Crescente. */
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int quantidade = 3;

        int [] Numeros = new int [quantidade];

        for (int i = 0; i < quantidade ; i++){

            System.out.println("Digite o " + (i+1) + "numero: ");
            Numeros[i] = entrada.nextInt();

        }
        Arrays.sort(Numeros);

        System.out.println("Numeros em ordem Crescente:");

        for(int Numero : Numeros){

            System.out.println(Numero);
        }

        entrada.close();

    }
    
}
