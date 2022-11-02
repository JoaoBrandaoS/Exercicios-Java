package ExerciciosDeLogica;
import java.util.Scanner;

/* Faça um codigo que calcule o estoque medio de um produto.*/

public class EstoqueMedio {
    static int quantidade_minima = 0;
    static int quantidade_maxima = 0;

    public static void main(String [] args){
       Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a quantidade minima do produto: ");
        quantidade_minima = entrada.nextInt();
        
        System.out.print("digite a quantidade maxima dos produtos: ");
        quantidade_maxima = entrada.nextInt();

        int media_de_produtos = (quantidade_minima + quantidade_maxima) / 2;

        System.out.println("A quantidade media desse produto em estoque é: " + media_de_produtos);
        
       entrada.close();
    }
    
}
