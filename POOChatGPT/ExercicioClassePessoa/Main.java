package ExercicioClassePessoa;

public class Main {
    
    public static void main(String [] args){

        Pessoa humano = new Pessoa("joao",20,'m',1.85,70);

        humano.CalcularImc();
        System.out.println(humano.VerificarIdade());

    }

}
