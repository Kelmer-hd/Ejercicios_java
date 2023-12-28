//Realiza operaciones básicas como suma, resta, multiplicación y división.
public class Main {
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 19;

        double suma, resta, multi;
        double divi;

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;

        System.out.println("La suma es: " + suma);
        System.out.println("la resta: " + resta);
        System.out.println("La multiplicatión es: " + multi);
        System.out.println("La división es: "+divi);
    }
}