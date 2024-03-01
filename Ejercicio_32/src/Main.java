import java.util.Scanner;

/*
    Construir un programa que calcule el factorial de un valor numérico introducido
    como parámetro o argumento en la línea de comandos.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número para calcular el Factorial: ");
        int numeroFactorial = scanner.nextInt();
        int contador = 1;

        for (int i = numeroFactorial; i >= 1; i--){
            contador *= i;
        }
        System.out.println("EL factorial de "+contador);
    }
}