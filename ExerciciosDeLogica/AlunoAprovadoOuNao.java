package ExerciciosDeLogica;
import java.util.Scanner;


/*4-Escreva um programa que leia quatro notas escolares de um aluno e
apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar
for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
do recuperação, somar com o valor da média e obter a nova média. Se a nova
média for maior ou igual a 7, apresentar uma mensagem informando que o aluno
foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma
mensagem informando esta condição. Apresentar junto com as mensagens o valor
da média do aluno. */

public class AlunoAprovadoOuNao {    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        
        double TotalNotas = 0; 
        double Media = 0;
        double Recuperacao = 0;

        for(int i = 0; i < 4 ; i++){ 

            System.out.println("Digite a nota do aluno: ");

            TotalNotas += entrada.nextDouble();
        }
        
        Media = TotalNotas / 4;

        if(Media >=7){

            System.out.println("Aluno Aprovado Com Media: " + Media);
        
        }else if(Media < 7){

            System.out.println("Digite o valor da nota da recuperação: ");
            Recuperacao = entrada.nextDouble();

            Media = (Media + Recuperacao) / 2;

            if(Media >=7) {
                System.out.println("Aluno Aprovado Com Media: " + Media);
                
            }
             else{
                System.out.println("Aluno Reprovado.");

            }
                
        }

        entrada.close();

    }
}
