/*
    Implementar un programa en el que, utilizando un bucle while, se escriban por pantalla los 51 primeros
    números de la sucesión de Fibonacci, definida por recurrencia como sigue:
        f0 = 0
        f1 = 1
        fn+2 = fn+1 + fn
*/

public class Main {
    public static void main(String[] args) {
        int numeroAnterior = 0;
        int numeroActual = 1;
        int contador = 0;

        System.out.println("Los primeros 51 números de la sucesión de Fibonacci son:");

        while (contador < 51) {
            System.out.print(numeroAnterior + " ");
            int siguienteNumero = numeroAnterior + numeroActual;
            numeroAnterior = numeroActual;
            numeroActual = siguienteNumero;
            contador++;
        }
    }
}
