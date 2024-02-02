import java.util.Scanner;

// Implementar un programa que convierta grados Fahrenheit a Celsius.
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gradosFahrenheit;
        System.out.print("Digite los grados Fahrenheit: ");
        gradosFahrenheit = scanner.nextInt();

        int resultado = (gradosFahrenheit - 32) * 5/9;

        System.out.println("La converción de " + gradosFahrenheit + " grados Fahrenheit es " + resultado + " Celcius");
    }
}
