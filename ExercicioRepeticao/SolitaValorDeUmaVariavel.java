package ExercicioRepeticao;

import java.util.Scanner;

public class SolitaValorDeUmaVariavel {
    
    public static void main(String [] args){

    Scanner entrada = new Scanner(System.in);

        String nome;
        float idade = 0;
        System.out.print("Caso queira adiciar um nome e uma idade, digite 1 " +
        " caso não digite 0: ");
        int executar = entrada.nextInt();

        while(executar != 0){

            System.out.print("Digite o nome do aluno: ");
            nome = entrada.next();

            System.out.println("Digite a idade do aluno: ");
            idade = entrada.nextFloat();

            System.out.printf("O aluno(a) %s, tem %.0f anos \n",nome,idade);
        
            System.out.print("Caso queira adiciar outro nome e outra idade, digite 1 " +
        " caso não digite 0: ");
            executar = entrada.nextInt();
        }
        


        entrada.close();
    }

}
