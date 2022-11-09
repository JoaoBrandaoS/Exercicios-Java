package ExercicioArrays;


public class OrdemInversa{

    public static void main(String [] args){

        int [] numeros = {3,4,5,7,8,9};
        //int tamanho = numeros.length;

        for(int i = numeros.length - 1; i >= 0; i--){

            System.out.println(numeros[i]);

        }

    }
}