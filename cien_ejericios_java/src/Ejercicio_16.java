import java.util.Scanner;

// Calcular el factorial de un número.
public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int numero_factorial = scanner.nextInt();
        int resultado = 1;

        for (int i = numero_factorial; i >=1; i--){
            resultado *= i;
        }

        System.out.println("El factorial de " +numero_factorial+ " es: "+ resultado);
    }
}
