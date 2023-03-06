package LogicaChatGPT;

import java.util.Arrays;

public class MaiorNumero {

    public static void main(String [] args){

        int [] listaDeNumeros = {2,4,6,6,7,8};
        Arrays.sort(listaDeNumeros);

        System.out.println("O segundo Maior numero é: " + listaDeNumeros[listaDeNumeros.length - 2]);


    }
    
}
