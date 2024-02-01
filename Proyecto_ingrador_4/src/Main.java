public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(12,8);
        System.out.println(calculadora.sumar());
        System.out.println(calculadora.resta());
        System.out.println(calculadora.multiplicacion());
        System.out.println(calculadora.divicion());
    }
}