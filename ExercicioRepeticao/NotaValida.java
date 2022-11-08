package ExercicioRepeticao;

import java.util.Scanner;
public class NotaValida {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("por favor digite um valor entre 0 e 10: ");
        double nota = entrada.nextDouble();

        while(nota < 0  || nota > 10){
            System.out.print("Valor invalido por favor digite de novo: ");
            nota = entrada.nextDouble();
        }


        entrada.close();
    }
    
}
