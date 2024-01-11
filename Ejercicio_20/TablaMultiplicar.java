import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Inicializar el contador
        int contador = 1;

        // Utilizar un bucle do-while para mostrar la tabla de multiplicar
        do {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        } while (contador <= 10);

        // Cerrar el objeto Scanner para evitar fugas de recursos
        scanner.close();
    }
}
