import java.util.Scanner;

public class NumeroFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número para calcular el factorial: ");
        int numero = scanner.nextInt();

        long factorial = 1;  // Inicializamos el factorial a 1

        for (int i = 1; i <= numero; i++) {
            factorial *= i;  // Multiplicamos el factorial por el número actual
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
