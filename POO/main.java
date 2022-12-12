package POO;

import POO.PrimeirasClasses.Escola;
import java.util.Scanner;

public class main {
    
    public static void main(String [] args){
    
        Scanner entrada = new Scanner(System.in);
        Escola estudantes = new Escola();
        int quantidade = 0;

        System.out.println("Diga o nome do aluno: ");
        estudantes.aluno = entrada.nextLine();

        System.out.println("Diga a sala do aluno: ");
        estudantes.sala = entrada.nextLine();

        System.out.println("Diga a quantidade de notas: ");
        quantidade = entrada.nextInt();

        for(int i = 0; i < quantidade; i++){
        System.out.println("Digite a nota do aluno: ");
        estudantes.nota += entrada.nextDouble();
        }

        estudantes.media = estudantes.CalcularMedia(estudantes.nota, quantidade);
        System.out.printf("A media do Aluno %s da sala %s é: %.1f",estudantes.aluno,estudantes.sala,estudantes.media);

        entrada.close();

}
}
