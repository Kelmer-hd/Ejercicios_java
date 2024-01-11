import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Implementar un programa que calcule la suma de los primeros N números naturales utilizando un bucle for.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad de números a sumar: ");
        int numero = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= numero; i++){
            suma = suma + i;

        }
        System.out.println("La suma es: " +suma);
    }
}