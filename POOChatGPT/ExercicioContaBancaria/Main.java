package ExercicioContaBancaria;


public class Main {
    
    public static void main(String [] args) throws SaldoInsuficienteException{
        ContaBancaria minhaConta = new ContaBancaria(1234,1000.0);
        minhaConta.Depositar(500);
        minhaConta.Sacar(200.0);
        System.out.println("Saldo Atual:" + minhaConta.ObterSaldo());

    }

}
