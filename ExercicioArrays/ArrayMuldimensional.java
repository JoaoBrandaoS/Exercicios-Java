package ExercicioArrays;

import java.util.Random;

public class ArrayMuldimensional {
    
    public static void main(String [] args){

        Random aleatorio = new Random();

        int [][] matrixnumeros = new int[4][4];

    
        for(int i = 0; i < matrixnumeros.length; i++){

            for(int p = 0; p < matrixnumeros.length; p++){

                int numero = aleatorio.nextInt(9);

                matrixnumeros[i][p] = numero;
            }
        }

        for(int[] linha : matrixnumeros){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }

}
