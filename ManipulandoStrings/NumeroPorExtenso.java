package ManipulandoStrings;

import java.util.Scanner;

/*
 * Escreva um programa que dado um valor numérico digitado pelo usuário 
 * (armazenado em  uma variável inteira), imprima cada um dos seus dígitos 
 * por extenso.
 */

public class NumeroPorExtenso {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        String [] ValoresPorExtenso = {"zero","um","dois","treis","quatro","cinco","seis","sete","oito","nove"};
        String ValorDigitado = "", ValorExtenso = "";


        System.out.println("Digite um valor numerico:");
        ValorDigitado = entrada.nextLine();

        for(int i = 0; i < ValorDigitado.length(); i++){
            if(ValorDigitado.charAt(i) == '0'){
                ValorExtenso += ValoresPorExtenso[0] + ",";
            }else if(ValorDigitado.charAt(i) == '1'){
                ValorExtenso += ValoresPorExtenso[1]+ ",";

            }else if(ValorDigitado.charAt(i) == '2'){
                ValorExtenso +=  ValoresPorExtenso[2] + "," ;

            }else if(ValorDigitado.charAt(i) == '3'){
                ValorExtenso += ValoresPorExtenso[3] + ",";
            }
            else if(ValorDigitado.charAt(i) == '4'){
                ValorExtenso += ValoresPorExtenso[4] + ",";
            }
            else if(ValorDigitado.charAt(i) == '5'){
                ValorExtenso += ValoresPorExtenso[5] + ",";
            }
            else if(ValorDigitado.charAt(i) == '6'){
                ValorExtenso += ValoresPorExtenso[6] + ",";
            }
            else if(ValorDigitado.charAt(i) == '7'){
                ValorExtenso += ValoresPorExtenso[7] + ",";
            }
            else if(ValorDigitado.charAt(i) == '8'){
                ValorExtenso += ValoresPorExtenso[8] + ",";
            }
            else if(ValorDigitado.charAt(i) == '9'){
                ValorExtenso += ValoresPorExtenso[9] + ",";
            }
        }
        System.out.println(ValorExtenso);
        entrada.close();

    }

}
