/*
    Crea un programa que sume los elementos de un arreglo.
*/
public class Main {
    public static void main(String[] args) {
         int numeros[] = {1,2,3,4,5,6,7,8,9, 10};
         int suma = 0;

         for (int numero : numeros) {
             suma += numero;
         }

        System.out.println("La suma es: " + suma);
    }
}