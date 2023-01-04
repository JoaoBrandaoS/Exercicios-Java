package ExercicioArrays;

import java.util.Scanner;

public class Main{

	public static void main(String [] args){

	String [] nomes;
		
	Scanner entrada = new Scanner(System.in);
		
	System.out.println("Digite quantidade de nomes para adicionar a lista: ");
	nomes = new String[entrada.nextInt()];
	
	for(int i = 0; i < nomes.length; i++){

		System.out.println("Digite um nome para adicionar: ");
		nomes[i] = entrada.nextLine();
        
	}

	
	entrada.close();
	}

}