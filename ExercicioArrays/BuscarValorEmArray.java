package ExercicioArrays;

import java.util.Scanner;
public class BuscarValorEmArray {

        public static void main(String [] args) {
            
            Scanner entrada = new Scanner(System.in);
            
            int [] Numeros = {10,20,30,40,45,32,50};
            
            System.out.print("Digite o valor que você quer pesquisar: ");
            int pesquisa = entrada.nextInt();
            
            
            for(int i : Numeros) {
                if(pesquisa == i) {
                System.out.println("O valor: " + pesquisa + " Foi encontrado");
                }
            }
            
            entrada.close();
            
        }
        
    }
    

