package ExercicioLIvraria;

public class Loja {

    private CarrinhoDeCompras carrinho;

    public Loja(){
        carrinho = new CarrinhoDeCompras();
    }

    public void AdicionarLivro(Livro livro){
        carrinho.AdicionarLivro(livro);
    }
    
    public void RemoverLivros(Livro livro){
        carrinho.RemoverLivros(livro);
    }
    public void FinalizarCompra(){
        double totalCompra = carrinho.CalcularTotal();
        System.out.println("Recibo: ");
        carrinho.ImprimirListaDeLivros();
        System.out.println("Total a pagar: " + totalCompra);
    }
}
