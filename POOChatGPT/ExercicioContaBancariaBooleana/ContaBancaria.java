package ExercicioContaBancariaBooleana;

class ContaBancaria{

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(){
        
    }
    
    public ContaBancaria(int numero,String titular,double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean Sacar(double saldo){

        if(getSaldo() < saldo){
            return false;

        }else {
            setSaldo(getSaldo() - saldo );
            return true;
        }
    }
    public boolean Consultar(double deposito){
        setSaldo(deposito);
        return true;

    }    

    public double ConsultarSaldo(){
        return this.saldo;

    }




}