import java.util.Scanner;
/*
    Construir un programa que simule el juego de la adivinanza de un número. El ordenador debe generar
    un número aleatorio entre 1 y 100 y el usuario tiene cinco oportunidades para acertarlo.
    Después de cada intento el programa debe indicarle al usuario si el número introducido por él es mayor,
    menor o igual al número a adivinar, y el número de intentos restantes.

        Nota: para generar el valor aleatorio puede emplearse la sentencia:
        int x  = (int) (100*Math.random()+1);
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****** Bienvenido al Juego de Adivinnzas ******");

        int numeroAleatorio = (int)(Math.random()*100+1);
        int intentosRestantes = 5;

        for (int i = 0; i < 5; i++) {
            System.out.print("Intento " + (i + 1) + ": Digite un número entre 1 y 100: ");
            int numero = scanner.nextInt();

            if (numero < numeroAleatorio) {
                System.out.println("El número es mayor. Intentos restantes: " + (intentosRestantes - i - 1));
            } else if (numero > numeroAleatorio) {
                System.out.println("El número es menor. Intentos restantes: " + (intentosRestantes - i - 1));
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en el intento " + (i + 1) + ".");
                return; // Salir del programa
            }
        }
        System.out.println("Lo siento, has agotado tus intentos. El número era " + numeroAleatorio + ".");
    }
}
