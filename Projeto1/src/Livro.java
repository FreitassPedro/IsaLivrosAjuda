import java.util.ArrayList;

public class Livro {
    //atributos
    private String titulo;
    private Long isbn;
    private Autor autor;
    private String editora;
    private int anoPub;

    public Livro() {
        //default
    }

    public Livro(String titulo, Long isbn, Autor autor, String editora, int anoPub) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.anoPub = anoPub;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public String imprimir() {
        return "\nTítulo: " + titulo
                + " - " + "\nISBN: "
                + isbn +
                "\nAutor: " + autor.getAutor() +
                "\nEditora: " + editora +
                "\nAno de Publicação: "
                + anoPub;
    }

}