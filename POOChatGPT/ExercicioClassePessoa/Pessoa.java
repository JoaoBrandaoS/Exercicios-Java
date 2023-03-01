package ExercicioClassePessoa;

import java.lang.Math;

public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    private double altura;
    private double peso;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, char sexo, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public double CalcularImc(){
        double imc = peso / Math.pow(altura,2);

        if(imc < 18.5){
            System.out.println("Abaixo do peso ideal!");
            return imc;
        }else if(imc > 18.5 && imc < 24.9){
            System.out.println("peso Normal!");
            return imc;
        }else if(imc > 25 && imc < 29.9){
            System.out.println("acima do peso ideal!");
            return imc;
        }else{
            System.out.println("obesidade");
            return imc;
        }
        
    }

    public boolean VerificarIdade(){
        if(getIdade() >=18){
            return true;
        }else{
            return false;
        }
    }
    public boolean VerificarSexo(char sexo){

        if(sexo == getSexo()){
            return true;
        }else{
            return false;
        }
    }

}
