import java.util.Scanner;

/*
    Implementa un programa que calcule la suma de los primeros N números naturales
*/
public class Main {
    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite un número: ");
            int num = scanner.nextInt();
            int suma = 0;
            for (int i = 1; i <= num; i++) {
                suma += i;
            }

            System.out.println("La suma es: " + suma);

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}