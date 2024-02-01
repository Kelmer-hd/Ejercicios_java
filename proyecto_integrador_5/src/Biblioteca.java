import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para mostrar la lista de libros disponibles
    public void mostrarLibrosDisponibles() {
        System.out.println("Libros Disponibles:");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                System.out.println("- " + libro.getTitulo() + " por " + libro.getAutor());
            }
        }
        System.out.println();
    }

    // Método para prestar un libro
    public void prestarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("Libro prestado: " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }

    // Método para devolver un libro
    public void devolverLibro(Libro libro) {
        libro.setDisponible(true);
        System.out.println("Libro devuelto: " + libro.getTitulo());
    }

}
