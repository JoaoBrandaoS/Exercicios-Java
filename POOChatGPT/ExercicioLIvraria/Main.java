package ExercicioLIvraria;

public class Main {

    public static void main(String [] args){
        Livro livro1 = new Livro("Eia preula","joao","kkkk",2000,1);
        Livro livro2 = new Livro("uepa","marcos","kkkksk",400,1);
        Livro livro3 = new Livro("ratinho","ricardo","kkllkk",3000,1);


        Loja compras = new Loja();

        compras.AdicionarLivro(livro3);
        compras.AdicionarLivro(livro2);
        compras.AdicionarLivro(livro1);

        compras.FinalizarCompra();
    }
}
