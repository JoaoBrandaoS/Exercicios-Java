package ExerciciosMetodos;

public class BibliotecaMetodos {
    
    //////////////////////////////////////////////////////////////
    //                  Operações Basicas                       //
    //////////////////////////////////////////////////////////////
    public double somaNumeros(double numero,double numero2){
    
        double total = numero + numero2;
    
    return total;
    
    }

    public double subtrairNumeros(double numero, double numero2){

        double total = numero - numero2;
    
    return total;

    }
    
    public double multiplicarNumeros(double numero, double numero2){

        double total = numero * numero2;
    
    return total;

}
    public double dividirNumeros(double numero, double numero2){

        double total = numero / numero2;
    
    return total;
    }

    //////////////////////////////////////////////////////////////
    //                  Emprestimo                              //
    //////////////////////////////////////////////////////////////

    public double fazerImprestimo(double valor, double parcelas){
        double taxa = 0.1;
        double parcela = parcelas;
        double valorImprestimo= 0;
        
        if(valor < 200 && parcela == 1){

            valorImprestimo = valor * taxa;

        } else if(valor < 200 && parcela > 1 && parcela < 4){

            valorImprestimo = valor * ( taxa * 2);
       
        }else if(valor < 200 && parcela > 4){

            valorImprestimo = valor * ( taxa * 4);
       
        } else if(valor > 200 && parcela >= 1){

            valorImprestimo = valor * (taxa * 2);

        }

    return valor + valorImprestimo;
    
}
    //////////////////////////////////////////////////////////////
    //                  Mensagem                                //
    //////////////////////////////////////////////////////////////


    public String mensagemDia(int hora){
        String frase = "";
        if( hora >= 5 && hora<=12){

            frase = "Bom dia!!";

        }else if(hora > 12 && hora <= 18){

            frase = "Boa tarde!!";

        }else{
            frase = "Boa noite!!";
        }

    return frase;
    }

    //////////////////////////////////////////////////////////////
    //                  Area dos quadrilateros(com sobrecarga)  //
    //////////////////////////////////////////////////////////////

public double calculaArea(double lado){

    lado*=lado;

    return lado;
}
public double calculaArea(double base,double altura){

    double resultado = base * altura;

    return resultado;
}



}
