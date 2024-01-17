import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado a la biblioteca: " + libro.getTitulo());
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                System.out.println(libro.getTitulo() + " - " + libro.getAutor());
            }
        }
    }

    public List<Libro> buscarLibros(String criterio) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().contains(criterio) || libro.getAutor().contains(criterio)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }
}
