package ExerciciosDeLogica;
import java.util.Scanner;
/*6-Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
Fahrenheit e a variável C representa é a temperatura em graus Celsius. */
public class ConverteTemperatura {
    
    public static void main(String [] args){

        System.out.print("Escreva a temperatura em Celcius: ");
        Scanner entrada = new Scanner(System.in);

        double celcius = entrada.nextDouble();

        double fahrenheit = (9 * celcius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
        entrada.close();


    }
}
