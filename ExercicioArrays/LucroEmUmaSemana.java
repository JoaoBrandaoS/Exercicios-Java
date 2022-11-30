package ExercicioArrays;

import java.util.Scanner;

public class LucroEmUmaSemana {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        double [] DiaSemana = {220,120,450,650,300,1050};
        double MediaSalarial = 0;
        
        for(int i = 0; i < DiaSemana.length; i++){

            MediaSalarial += DiaSemana[i];

        }

        System.out.println("A media de lucros na semana foi:" + MediaSalarial/ DiaSemana.length);
        


        entrada.close();
    }
}
