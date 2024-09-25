package src.Services;
import src.Repository.RepositoryBiblioteca;
import src.Entity.EntityBiblioteca;

public class ServicesBiblioteca {



    RepositoryBiblioteca repositoryBiblioteca = new RepositoryBiblioteca();
       // Método para prestar el libro
       public String prestar(EntityBiblioteca  libro) {
        if (libro.isDisponible())
         {
            libro.setDisponible(  false);
            return "El préstamo ha sido aprobado para el libro: " + libro.getTitulo();
        } else {
            return "El libro no está disponible para préstamo.";
        }
    }

    // Método para devolver el libro
    public String devolver( EntityBiblioteca  libro) 
    {
        if (!libro.isDisponible()) {
            libro.setDisponible( true);
            return "El libro ha sido devuelto correctamente: " + libro.getTitulo();
        } else {
            return "El libro ya estaba disponible, no es necesario devolverlo.";
        }
    }

}
