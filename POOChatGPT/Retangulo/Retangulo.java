package Retangulo;

public class Retangulo {
    
    private double largura;
    private double altura;

    public Retangulo(){

    }
    public Retangulo(double largura, double altura){

        this.altura = altura; this.largura = largura;

    }

    public double CalcularArea(){
        return largura * altura;
    }

    public double CalcularPerimetro(){
        return 2 * (largura + altura);
    }

    public void setAltura( double altura){
        this.altura = altura;
    }

    public void setLargura( double largura){
        this.largura = largura;
    }

}
