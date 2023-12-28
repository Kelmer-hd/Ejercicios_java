import java.util.Scanner;

// Escribe un programa que determine si un número es positivo, negativo o cero.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("El "+ num + " es cero!!");
        } else if (num > 0) {
            System.out.println("El "+ num + " es Mayor a cero! ");
        }else{
            System.out.println("El "+ num + " es Menor a cero!");
        }
    }
}