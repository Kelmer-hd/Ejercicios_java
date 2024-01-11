import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escribe un programa que sume todos los números pares hasta un número dado.

        // Pedimos los numero y almacenamos en la variable numero
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numeroMaximo = scanner.nextInt();

        int sumaPares = 0;

        for (int i = 2; i <= numeroMaximo; i += 2) {
            sumaPares += i;
        }

        System.out.println("La suma de los números pares hasta " + numeroMaximo + " es: " + sumaPares);

    }
}