package ExerciciosDeLogica;

import java.util.Scanner;

/*NOME DA CLASSE QtdCombustivel.java
5-Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais. */


public class GastoDeGasolina {

static final int DISTANCIAPORLITRO = 12;
public static void main(String [] args){

    Scanner entrada = new Scanner(System.in);
    double VelocidadeMedia = 0;
    double TempoDaViagem = 0;

    System.out.print("Digite a velocidade media do veiculo: ");
    VelocidadeMedia = entrada.nextDouble();

    System.out.print("Digite o tempo de viagem: ");
    TempoDaViagem = entrada.nextDouble();

    double Distancia = TempoDaViagem * VelocidadeMedia;

    double LitrosGastos = Distancia / DISTANCIAPORLITRO;

    System.out.println("A quantidade de Litros gastos na viagem foi: " + LitrosGastos);


    entrada.close();

}    

}
