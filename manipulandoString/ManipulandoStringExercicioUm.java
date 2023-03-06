package manipulandoString;

public class ManipulandoStringExercicioUm {

    public static void main(String [] args){
        String listaNumeros = "3,5,7,2,10";

        String [] NovaLista = listaNumeros.split( ",");

        double soma = 0;
        for (String numero : NovaLista){
            soma += Integer.parseInt(numero);
        }

        System.out.printf("A media dos valores é : %.1f ", + soma / NovaLista.length );
    }

}
