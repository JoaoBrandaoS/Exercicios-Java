package ManipulandoStrings;

import java.util.Scanner;

/*Escreva um programa que, a partir de um nome informado pelo usuário,
exiba suas  iniciais.  As iniciais são formadas pela primeira letra de
cada nome, sendo que todas deverão  aparecer em maiúsculas na saída do
programa. Note que os conectores e, do, da, dos, das,  de, di, du não
são considerados nomes e, portanto, não devem ser considerados para a 
obtenção das iniciais. As iniciais devem ser impressas em maiúsculas,
ainda que o nome  seja entrado todo em minúsculas.
 */

public class Iniciais {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        String nome = "", iniciais = "";
        String [] NaoENome = {"e","do","da","dos","das","de","di","du"};

        System.out.println("Digite seu nome");
        nome = entrada.nextLine();

        String [] ArrayNome = nome.split(" ");

        for(String i : ArrayNome)
            for(String x : NaoENome){
                if(i != x){
                    iniciais += i.charAt(0);
                    break;
            }

            }
        System.out.println(iniciais.toUpperCase());    


        entrada.close();

    }
}
