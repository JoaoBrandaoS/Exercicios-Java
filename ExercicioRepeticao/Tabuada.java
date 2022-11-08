package ExercicioRepeticao;

import java.util.Scanner;

public class Tabuada {  

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor para a tabuada que sej entre 1 a 10");
        int valor = entrada.nextInt();
        int cont = 0;

        if(valor > 0 && valor <=10){

            while(cont <= 10){

                System.out.printf(" %d x %d = %d \n",valor,cont,valor * cont);
                cont += 1;

            }

        }else{
            System.out.println("Valor invalido!");
        }

        entrada.close();
    }
    
}
