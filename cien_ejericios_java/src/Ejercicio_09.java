import java.util.Scanner;

// Determinar si un número es positivo, negativo o cero.
public class Ejercicio_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int numero = scanner.nextInt();

        if (numero == 0){
            System.out.println("El número es cero");
        }else if (numero > 0){
            System.out.println("El número es mayor a cero");
        }else{
            System.out.println("El número es menor a cero");
        }

    }
}
