import java.util.Scanner;
public class VerificarBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");

        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();

            if (esBisiesto(year)) {
                System.out.println(year + " es un año bisiesto.");
            } else {
                System.out.println(year + " no es un año bisiesto.");
            }
        } else {
            System.out.println("Error: Por favor, ingrese un año válido.");
        }

        scanner.close();
    }

    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int year) {
        // Un año es bisiesto si es divisible por 4, pero no por 100, excepto si es divisible por 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
