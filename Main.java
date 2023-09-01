public class Main {
    public static void main(String[] args){
        Livros livro = new Livros("banana", "joao", 2000, 400);
        Livros livro1 = new Livros("manga", "paulo", 2000, 400);
        Livros livro2 = new Livros("manga", "pedro", 2000, 400);
        Biblioteca b = new Biblioteca("Centro", "Biblioteca central");

        b.addLivro(livro);
        b.addLivro(livro1);
        b.addLivro(livro2);
        b.mostrarAcervo();
        b.emprestarLivro(livro2);
        b.emprestarLivro(livro1);
        b.mostrarAcervo();
        b.emprestarLivro(livro1);
        b.devolverLivro(livro);

    }
}
