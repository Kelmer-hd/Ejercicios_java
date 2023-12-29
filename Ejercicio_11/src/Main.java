/*
    Escribe un método que calcule el área de un círculo.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("El area es: " +calcularArea(2));
        System.out.println("El area es: " + calcularArea(10));
    }

    public static double calcularArea(int radio){
        return Math.PI * Math.pow(radio, 2);
    }
}