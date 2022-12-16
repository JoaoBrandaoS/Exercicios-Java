package SaqueDeposito;

public class Banco {

    private String Cliente;
    private double saldo;

    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        Cliente = cliente;
    }
    public double getSaldo() {
        if(saldo > 0){
            return saldo;

        }else{
            saldo = 0;
            return saldo;
        }
        
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    double sacar(double sacando){
        double saque = getSaldo();

        if(sacando < saque){
        Double retirada = saque - sacando;
        setSaldo(retirada);
        return sacando;

        }else{
            return 0;

        }   
        
    }
    void deposito(double depositando){
       double valor = getSaldo();
       depositando += valor; 
       setSaldo(depositando);

    }

    
}
