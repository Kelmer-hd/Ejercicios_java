import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un programa que solicite dos números al usuario y muestre el mayor de ellos.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el primero número: ");
        int numero = scanner.nextInt();

        System.out.print("Digite el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero2 > numero){
            System.out.println("El mayor es " + numero2);
        }else{
            System.out.println("El mayor es: " +numero);
        }
    }
}