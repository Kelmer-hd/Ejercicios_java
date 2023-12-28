/*
    Utiliza un bucle para imprimir los números del 1 al 10.
 */
public class Main {
    public static void main(String[] args) {
        // con for
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // con while
        System.out.println("*************************************");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}