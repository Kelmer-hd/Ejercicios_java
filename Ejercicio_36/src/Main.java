import java.util.Scanner;

/*
    Construir un programa en el que se pida al usuario dos números enteros positivos, n y m, y
    usando un bucle for, escriba el valor de n elevado a m.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el primero número entero: ");
        int n = scanner.nextInt();

        System.out.print("Digite el segundo número entero:");
        int m = scanner.nextInt();

        int resultado = 1;
        for (int i = 0; i < m; i++) {
            resultado *= n;
        }

        System.out.println(n + " elevado a " + m + " es igual a " + resultado);
    }
}