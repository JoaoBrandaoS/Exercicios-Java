package ExercicioLIvraria;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private double preco;
    private int quantidade; 

    public Livro(){
        
    }
    public Livro(String titulo,String autor,String isbn,double preco,int quantidade){
        this.titulo =titulo;
        this.autor =autor;
        this.isbn = isbn;
        this.preco=preco;
        this.quantidade = quantidade;
        
    }

    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public String getIsbn() {
        return isbn;
    }



    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public double getPreco() {
        return preco;
    }



    public void setPreco(double preco) {
        this.preco = preco;
    }



    public int getQuantidade() {
        return quantidade;
    }



    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public double CalcularTotal(){
        double vendas = getQuantidade() * getPreco();
        return vendas;
    }
     
}
