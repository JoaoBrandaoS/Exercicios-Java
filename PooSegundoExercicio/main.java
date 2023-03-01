package PooSegundoExercicio;

import java.util.Scanner;

public class main {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        escola alunos = new escola();
        int quantidadeNotas = 0;

        System.out.println("DIgite o nome do aluno: ");
        alunos.setAluno(entrada.nextLine());

        System.out.println("Digite a Sala do aluno: ");
        alunos.setSala(entrada.nextLine());

        System.out.println("Digite a quantidades de notas para ser adicionadaas: ");
        quantidadeNotas = entrada.nextInt();

        for(int i = 0; i<quantidadeNotas; i++){
            System.out.println("Digite a nota do aluno: ");
            alunos.setNota(entrada.nextDouble());
        }   
        
        alunos.setMedia(alunos.getNota(), quantidadeNotas);
        System.out.printf("\nAluno(a): %s\nSala:%s\nMedia:%.1f",alunos.getAluno(),alunos.getSala(),alunos.getMedia());
        
        entrada.close();

    }
    
}
