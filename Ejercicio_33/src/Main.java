import java.util.Scanner;

/*
    Construir un programa en el que, utilizando un bucle for, se escriba por pantalla una tabla de
    conversión de grados Fahrenheit a Celsius, para los valores de 0 hasta 300 grados, en intervalos de 20.
    La regla de conversión es la siguiente:
        ªC = (5/9)(ºF - 32)
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabla de conversión de grados Fahrenheit a Celsius:");
        System.out.println("ºF\tºC");

        for (int gradosFahrenheit = 0; gradosFahrenheit <= 300; gradosFahrenheit += 20) {
            double gradosCelsius = (5.0 / 9.0) * (gradosFahrenheit - 32);
            System.out.println(gradosFahrenheit + "\t" + gradosCelsius);
        }

        scanner.close(); // Cerramos el scanner al finalizar su uso
    }
}