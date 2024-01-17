import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Libro> librosPrestados;
    private int limiteLibrosPrestados;

    public Cliente(String nombre, int limiteLibrosPrestados) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
        this.limiteLibrosPrestados = limiteLibrosPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void tomarPrestado(Libro libro) {
        if (librosPrestados.size() < limiteLibrosPrestados) {
            librosPrestados.add(libro);
            System.out.println(nombre + " ha tomado prestado el libro: " + libro.getTitulo());
        } else {
            System.out.println(nombre + " ha alcanzado el límite de libros prestados.");
        }
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        System.out.println(nombre + " ha devuelto el libro: " + libro.getTitulo());
    }
}
