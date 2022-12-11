package ManipulandoStrings;

import java.util.Scanner;

public class ProcuraNaString {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        final String frase = "Por isso, você é indesculpável quando julga os outros,"+
        "não importando quem você é. Pois, naquilo que julga o outro, você está"+
        "condenando a si mesmo, porque pratica as mesmas coisas que condena";

        System.out.println(frase);
        System.out.println("Digite uma palavra para buscar na frase acima");
        String busca = entrada.nextLine();

        double quantidade = frase.indexOf(busca);

        if(quantidade > 0){
            System.out.printf("\na palavra %s foi encontrada na frase!!",busca);
        }else{
            System.out.printf("\na palavra %s não foi encontrada!",busca);
        }


        entrada.close();
    }

}
