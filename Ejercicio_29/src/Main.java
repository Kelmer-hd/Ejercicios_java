import java.util.Scanner;

/*
    Definir dos variables num1 y num2 e implementar un programa que asigne un valor a cada una,0
     y obtenga el mayor de los dos, mostrando el resultado por pantalla.
*/
public class Main {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite el segundo Número: ");
        num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("De los numeros " + num1 + ", " + num2 + " el mayor es: "+num1);
        }else{
            System.out.println("De los numeros " + num1 + ", " + num2 + " el mayor es: "+num2);
        }
    }
}