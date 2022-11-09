package ExercicioArrays;

import java.util.Random;

public class NumerosAleatorios {
    
    public static void main(String [] args){

        Random aleatorio = new Random();

        int [] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++){

            int numero = aleatorio.nextInt(100);
            numeros[i] = numero;
        }

        for (int p: numeros){

            System.out.printf("O numero no array é: %d e seu sucessor é: %d \n\n",p,p+1);
        }

    }

}
