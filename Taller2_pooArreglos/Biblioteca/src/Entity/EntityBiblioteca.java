package src.Entity;
public class EntityBiblioteca {
    // Atributos
    private String titulo;
    private String autor;
    private int ISBN;
    private int numeroPaginas;
    private boolean disponible;

    // Constructor
    public EntityBiblioteca(String titulo, String autor, int ISBN, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true; // Por defecto, un libro está disponible
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


    public int getISBN() {
        return ISBN;
    }


    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }


    public int getNumeroPaginas() {
        return numeroPaginas;
    }


    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


    public boolean isDisponible() {
        return disponible;
    }


    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    // Método para mostrar la información del libro
    public String toString() {
        return "Libro { Título: " + titulo + ", Autor: " + autor + ", ISBN: " + ISBN + ", Número de Páginas: " + numeroPaginas + ", Disponible: " + disponible + " }";
    }
}