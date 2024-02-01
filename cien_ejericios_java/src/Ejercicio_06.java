import java.util.Scanner;

// Calcular el área de un triángulo.
public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite la altura del triángulo: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite la base del triángulo: ");
        double base = scanner.nextDouble();

        double resultado = (base * altura) / 2;

        System.out.println("El area de triangulo con base "+ base + " y altura " + altura + " es: "+ resultado);
    }
}
