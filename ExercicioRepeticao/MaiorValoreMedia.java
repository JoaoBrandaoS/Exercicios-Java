package ExercicioRepeticao;

import java.util.Scanner;

public class MaiorValoreMedia {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        float media = 0, numero = 0, maiornumero = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite a nota do aluno: ");
            numero = entrada.nextFloat();
            if(numero > maiornumero){
                maiornumero = numero;
            }
            media += numero;

        }

        media /= 5;
        System.out.printf("O maior numero é %.1f, e a media é %.1f",maiornumero,media);
        entrada.close();
    }
    
}
