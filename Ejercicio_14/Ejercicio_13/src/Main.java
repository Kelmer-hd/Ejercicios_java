import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Escribir un programa que determine si un número ingresado por el usuario es positivo, negativo o cero.
        */
        Scanner scanner = new Scanner(System.in);


        try{
            System.out.println("Digite un número: ");
            int numero = scanner.nextInt();

            if (numero == 0){
                System.out.println("E número es cero");
            } else if (numero > 0) {
                System.out.println("El número es mayor a cero");
            }else{
                System.out.println("El número es menor a cero");
            }
        }catch (Exception e){
            System.out.println("Error datos ingresados son incorrectos " + e);
        }



    }
}