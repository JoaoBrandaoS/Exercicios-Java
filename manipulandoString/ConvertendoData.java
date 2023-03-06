package manipulandoString;

public class ConvertendoData {

public static void main(String [] args){

    String data = "24/02/2023";

    String [] dataFormatada = data.split("/");

    System.out.printf("Dia: %s \nMês: %s\nAno: %s",dataFormatada[0],dataFormatada[1],dataFormatada[2]);


}
    
}
