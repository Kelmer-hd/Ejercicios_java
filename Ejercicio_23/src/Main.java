import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Implementa un programa que calcule el factorial de un número.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un numero para el hacer el factorial: ");
        int num_factorial = scanner.nextInt();
        int sumaFactorial = 0;

        for (int i = num_factorial; i < 0; i--){
            sumaFactorial *= num_factorial;
        }

        System.out.println("El factorial de " + num_factorial + " es " + sumaFactorial);
    }
}