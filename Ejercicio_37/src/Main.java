import java.util.Scanner;

/*
    Construir un programa en el que se pida al usuario un número entero positivo
     n (validar que lo sea), y usando un bucle while, escriba por pantalla el valor
     del factorial de n.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número entero positivo: ");
        int n = scanner.nextInt();

        // Validar que el número ingresado sea positivo
        if (n < 0) {
            System.out.println("El número ingresado no es positivo.");
        } else {
            int factorial = 1;
            int contador = 1;

            // Calcular el factorial usando un bucle while
            while (contador <= n) {
                factorial *= contador;
                contador++;
            }

            // Imprimir el resultado
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
    }
}