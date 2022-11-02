package ExerciciosDeLogica;

import java.util.Scanner;

/*Faça um codigo que receba dois numeros, verifique qual dos numeros é maior e
 * faça que o codigo conte do numero maior para o menor.
 */
public class DiferencaEntreNumeros {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundo_numero = entrada.nextInt();

        if(numero > segundo_numero){
            for( int i = numero; i>=segundo_numero; i--){
                System.out.println(i);
            }
        }else{
            for( int t = segundo_numero; t>=numero; t--){
                System.out.println(t);
            }

        }


        entrada.close();
    }
    
}
