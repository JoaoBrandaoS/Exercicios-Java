package ExerciciosMetodos;



public class main extends BibliotecaMetodos {
    
    public static void main(String [] args){

    BibliotecaMetodos operacao = new BibliotecaMetodos();
    
    /*
    
        codigo para fazer operação:

    double x = 5, y = 6;
    double resultado = operacao.somaNumeros(x,y);

    System.out.println(resultado);
    
    */
    /* 

        Fazendo Emprestimo!!

        double imprestimo = 100;

        double total = operacao.fazerImprestimo(imprestimo,1);

        System.out.println("O valor a pagar pelo imprestimo é: " + total);
   
    */
    
    /*
    
        dar bomdia/boa tarde/boa noite

        int hora = 12;

        String mensagem = operacao.mensagemDia(hora);

        System.out.println(mensagem);
    */


    double altura = 6, base = 4;


    double area = operacao.calculaArea(altura,base);

    System.out.println(area);
}
}
