package Retangulo;

public class Main {
    
    public static void main(String [] args){

        Retangulo  retangulo = new Retangulo(5,10);

        System.out.println("Área: " + retangulo.CalcularArea());
        System.out.println("Perímetro: " + retangulo.CalcularPerimetro());
        retangulo.setLargura(8);
        retangulo.setAltura(6);
        System.out.println("Área: " + retangulo.CalcularArea());
        System.out.println("Perímetro: " + retangulo.CalcularPerimetro());

    }

}
