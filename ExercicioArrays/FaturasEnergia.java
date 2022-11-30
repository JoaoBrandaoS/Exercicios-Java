package ExercicioArrays;

import java.util.Scanner;

public class FaturasEnergia {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantas faturas mensais serão usadas: ");
        int ArrayTamanho = entrada.nextInt();

        double [] faturas = new double[ArrayTamanho];
        double media = 0;

        for(int i = 0; i < faturas.length; i++){

            System.out.println("Digite a fatura do Mês: ");
            faturas[i] = entrada.nextDouble();

        }

        for (int x = 0; x <faturas.length; x++){
            media += faturas[x];
        }

        System.out.println("A media das faturas é: " + media/faturas.length);

        entrada.close();

    }
    
}
