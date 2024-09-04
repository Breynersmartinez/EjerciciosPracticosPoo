class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int ISBN;
    private int numeroPaginas;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, int ISBN, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true; // Por defecto, un libro está disponible
    }

    // Método para prestar el libro
    public String prestar() {
        if (disponible) {
            disponible = false;
            return "El préstamo ha sido aprobado para el libro: " + titulo;
        } else {
            return "El libro no está disponible para préstamo.";
        }
    }

    // Método para devolver el libro
    public String devolver() {
        if (!disponible) {
            disponible = true;
            return "El libro ha sido devuelto correctamente: " + titulo;
        } else {
            return "El libro ya estaba disponible, no es necesario devolverlo.";
        }
    }

    // Método para mostrar la información del libro
    public String toString() {
        return "Libro { Título: " + titulo + ", Autor: " + autor + ", ISBN: " + ISBN + ", Número de Páginas: " + numeroPaginas + ", Disponible: " + disponible + " }";
    }
}