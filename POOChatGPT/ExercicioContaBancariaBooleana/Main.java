package ExercicioContaBancariaBooleana;

import java.util.Scanner;

public class Main {
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        ContaBancaria banco = new ContaBancaria(1234,"Santander",2000);

        System.out.println("Digite o valor do seu saque: ");
        double sacar = entrada.nextDouble();
        entrada.close();

        if(banco.Sacar(sacar)){
            System.out.printf("Você sacou R$:%.2f Reais",sacar);
        }else{
            System.out.println("Saldo insuficiente");            
        }

        System.out.println("\nSeu saldo é: "+banco.getSaldo());

    }

}
