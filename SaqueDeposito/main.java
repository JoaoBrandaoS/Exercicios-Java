package SaqueDeposito;

import java.util.Scanner;
import SaqueDeposito.Banco;

public class main {
public static void main(String [] args){

    Scanner entrada = new Scanner(System.in);
    Banco usBanco = new Banco();

    System.out.print("Digite o nome do Cliente: ");
        String nome = entrada.nextLine();
        usBanco.setCliente(nome);

        System.out.println("\npara sacar digite [1]\npara depositar digite [2]\npara mostrar o saldo digite [3]\nDigite [4] para sair\n");
        int operacao = entrada.nextInt();
    while (true){
        if(operacao < 1 || operacao > 4){
            System.out.println("operação invalida");
        
        }else if(operacao == 4){
            break;

        }else if(operacao == 1){
        
            System.out.println("digite o valor para saque:");
            double valor = entrada.nextDouble();
            if(usBanco.sacar(valor) > 0){
                usBanco.sacar(valor);
                System.out.printf("Você sacou %.1f",valor);

            }else{
                System.out.println("Você não possui valor para sacar");

            }

        }else if(operacao == 2){
            
            System.out.println("digite o valor para deposito:");
            double valor = entrada.nextDouble();
            usBanco.deposito(valor);
        }else if(operacao == 3){
        
            System.out.printf("Seu saldo é %.1f",usBanco.getSaldo());
        
        }
        
        System.out.println("\n\npara sacar digite [1]\npara depositar digite [2]\npara mostrar o saldo digite [3]\nDigite [4] para sair\n");
        operacao = entrada.nextInt();

    }
        entrada.close();

}
    
}
