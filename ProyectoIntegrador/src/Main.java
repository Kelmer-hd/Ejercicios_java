public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter", "J.K. Rowling", "9780545582889");
        Libro libro2 = new Libro("1984", "George Orwell", "9780451524935");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibrosDisponibles();

        Cliente cliente1 = new Cliente("Juan", 2);
        Cliente cliente2 = new Cliente("Maria", 3);

        cliente1.tomarPrestado(libro1);
        cliente2.tomarPrestado(libro2);

        biblioteca.mostrarLibrosDisponibles();

        cliente1.devolverLibro(libro1);
        biblioteca.mostrarLibrosDisponibles();
    }
}
