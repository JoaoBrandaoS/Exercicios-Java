package ExercicioArrays;

import java.util.Scanner;

public class LerConsoante {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        String [] consoantes = new String[6];
        int contadorconsoantes = 0;
        

        int cont = 0;

        do{
            System.out.print("Digite uma letra: ");
            String letra = entrada.next();

            if( !(letra.equalsIgnoreCase("a") | 
            letra.equalsIgnoreCase("e") | 
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u")
            ) ){
                consoantes[cont] = letra;
                contadorconsoantes ++;
            }
            cont++;
        }while(cont < consoantes.length);

        for ( String consoante : consoantes){
           
            if(consoante != null){ 
            System.out.println(consoante);
           }
        }

        System.out.println("A quantidade de Consoantes é: " + contadorconsoantes);
        entrada.close();

    }
}
