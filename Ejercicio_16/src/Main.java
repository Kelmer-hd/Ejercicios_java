import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escribir un programa que determine si un número es par o impar.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un número: ");

        if (scanner.hasNextInt()){
            int numero = scanner.nextInt();

            if (numero % 2 == 0){
                System.out.println("El número es par");
            }else{
                System.out.println("El número es impar ");
            }
        }else{
            System.out.println("Error tipo de dato no esta permitido");
        }
    }
}