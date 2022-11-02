package ExerciciosDeLogica;

import java.util.Scanner;

/* Crie um codigo que receba uma certa quantidade de valores definida pelo usuario
 * e depois tire a media desses valores.
 */
public class CalcularMediaDeVariosNumeros {
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite quantos valores serão calculados: ");
        int quantidade = entrada.nextInt();
        double total = 0;

        for(int x = 0; x <= quantidade; x++){

            System.out.print("Digite o valor a acrescentar: ");
            double valor = entrada.nextDouble();
            total += valor;
        }
        System.out.println("A media dos valores é: " + total/quantidade);

        entrada.close();

    }
}
