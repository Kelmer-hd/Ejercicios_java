import java.util.Scanner;

// Crear un programa que pida dos números y los intercambie.
public class Ejercicio_10 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int axiliar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el primer Numero:" );
        numero1 = scanner.nextInt();

        System.out.print("Digite el segundo Numero:" );
        numero2 = scanner.nextInt();

        System.out.println("Antes de invertir el numero1 es: "+numero1);
        System.out.println("Antes de invertir el numero2 es: "+numero2);

        // en mi variable auxialiar almaceno el valor de numero1
        numero1 = numero1 + numero2;   // auxiliar = 2;
        numero2 = numero1 - numero2;

        numero1 = numero1 - numero2;

        System.out.println("El numero invertido es de numero1: " + numero1);
        System.out.println("El numero inverido es de numero2: " + numero2);

    }
}
