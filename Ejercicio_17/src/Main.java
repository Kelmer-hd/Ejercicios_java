import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un programa que pida al usuario tres números e imprima el mayor de ellos.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite el tercer valor: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El número mayor es: "+num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("El número mayor es: " +num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es: "+num3);
        }
    }
}