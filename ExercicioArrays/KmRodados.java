package ExercicioArrays;

import java.util.Scanner;

public class KmRodados {
    public static void main(String [] args){

        Scanner entrada =  new Scanner(System.in);

        double mediatotal = 0;
        System.out.print("Digite a quantidade de dias rodados: ");
        int tamanhoArray = entrada.nextInt();

        double [] Dias = new double[tamanhoArray], MediaSemanas = new double [2];

        for(int i = 0; i < Dias.length; i++){
            System.out.println("Digite os km do dia: ");
            Dias[i] = entrada.nextDouble();

        }
        for(int x = 0; x < Dias.length; x++){
        mediatotal += Dias[x];

            if(x == 7){
                MediaSemanas[0] = mediatotal / 7;
                double semanaDois = 0;
                for(int z = 8; z < Dias.length; z++){
                     semanaDois += Dias[z];
                }
                MediaSemanas[1] = semanaDois/7;
                }
            
        }

        System.out.println("A media total é: " + mediatotal/Dias.length +
         "\njá a media da primeira semana é: " + MediaSemanas[0]
         + " e na segunda semana é: " + MediaSemanas[1]);


        entrada.close();

    }
    
}
