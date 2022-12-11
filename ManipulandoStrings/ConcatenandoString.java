package ManipulandoStrings;

import java.util.Scanner;

public class ConcatenandoString {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma Frase ou palavra: ");
        String frase1 = entrada.nextLine();

        System.out.println("Digite uma Frase ou palavra para se juntar a primeira: ");
        String frase2 = entrada.nextLine();

        System.out.printf("%s %s",frase1,frase2);


        entrada.close();

    }
    
}
