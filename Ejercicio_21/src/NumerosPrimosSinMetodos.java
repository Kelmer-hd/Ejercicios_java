import java.util.Scanner;

 public class NumerosPrimosSinMetodos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número para imprimir los números primos hasta ese número: ");
        int limite = scanner.nextInt();

        System.out.println("Números primos hasta " + limite + ":");

        // Utilizar un bucle for para encontrar y mostrar los números primos
        for (int i = 2; i <= limite; i++) {
            boolean esPrimo = true;

            // Verificar si i es primo
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            // Imprimir i si es primo
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }

        // Cerrar el objeto Scanner para evitar fugas de recursos
        scanner.close();
    }
}
