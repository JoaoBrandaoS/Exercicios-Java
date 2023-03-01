package ExercicioContaBancaria;

import ExercicioContaBancaria.SaldoInsuficienteException;

public class ContaBancaria {
  
    private int numeroDaConta;
    private double saldoAtual;

    public ContaBancaria(){

    }

    public ContaBancaria(int numDaConta, double saldoAtual){
        this.numeroDaConta = numDaConta;
        this.saldoAtual = saldoAtual;
    }

    public void Depositar(double deposito){
        this.saldoAtual += deposito;
    }

    public void Sacar(double saque) throws SaldoInsuficienteException{
        if(saque > ObterSaldo()){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldoAtual -= saque;
        
    }

    public double ObterSaldo(){
        return this.saldoAtual;
    }

}