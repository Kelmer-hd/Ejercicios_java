/**
 * Crea un programa que identifique si un número es par o impar.
 */
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite un número: ");
            int num = scanner.nextInt();
            if(num % 2 == 0){
                System.out.println("El "+ num+ " es par");
            }else{
                System.out.println("El "+ num+ " es impar");
            }
        }catch (Exception e){
            System.out.println("Tipo no admitido");
        }


    }
}