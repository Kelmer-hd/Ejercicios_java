import java.util.Scanner;

public class JuegoCrucigrama {
    public static void main(String[] args) {
        // Definir palabras y sus posiciones
        String[] palabras = {"JAVA", "PYTHON", "CROSSWORD", "PROGRAMMING"};
        int[] posicionesX = {1, 3, 0, 7};
        int[] posicionesY = {0, 2, 3, 1};

        // Crear la cuadrícula del crucigrama
        char[][] crucigrama = new char[5][10];
        inicializarCrucigrama(crucigrama);

        // Mostrar el crucigrama inicial
        mostrarCrucigrama(crucigrama);

        Scanner scanner = new Scanner(System.in);

        // Permitir al usuario llenar el crucigrama
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese una letra para la palabra '" + palabras[i] + "': ");
            char letra = scanner.next().toUpperCase().charAt(0);
            llenarCrucigrama(crucigrama, palabras[i], letra, posicionesX[i], posicionesY[i]);
            mostrarCrucigrama(crucigrama);
        }

        System.out.println("¡Felicidades! Has completado el crucigrama.");
    }

    // Inicializar la cuadrícula del crucigrama con espacios en blanco
    private static void inicializarCrucigrama(char[][] crucigrama) {
        for (int i = 0; i < crucigrama.length; i++) {
            for (int j = 0; j < crucigrama[i].length; j++) {
                crucigrama[i][j] = ' ';
            }
        }
    }

    // Llenar la cuadrícula del crucigrama con la palabra y la letra dada
    private static void llenarCrucigrama(char[][] crucigrama, String palabra, char letra, int x, int y) {
        for (int i = 0; i < palabra.length(); i++) {
            crucigrama[y][x + i] = palabra.charAt(i) == letra ? letra : '_';
        }
    }

    // Mostrar la cuadrícula del crucigrama en la consola
    private static void mostrarCrucigrama(char[][] crucigrama) {
        System.out.println("Crucigrama:");
        for (char[] fila : crucigrama) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
