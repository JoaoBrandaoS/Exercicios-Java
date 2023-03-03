package ExercicioLIvraria;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Livro> livros;

    public CarrinhoDeCompras(){
        livros = new ArrayList<>();
    }

    public void AdicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void RemoverLivros(Livro livro){
        livros.remove(livro);
    }

    public double CalcularTotal(){
        double total = 0;
        for(Livro livro: livros){
            
            total+= livro.CalcularTotal();
        }
        return total;
    }

    public void ImprimirListaDeLivros(){
        for(Livro livro : livros){
            System.out.printf("Titulo do livro: %s - Autor: %s \n",livro.getTitulo(),livro.getAutor());
        }
    }
}
