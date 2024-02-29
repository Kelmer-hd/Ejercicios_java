import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        char operacion = JOptionPane.showInputDialog("¿Qué operación desea realizar? \nS: Sumar \nR: Restar \nP: Multiplicar \nD: Dividir").toUpperCase().charAt(0);

        if (operacion == 'S') {
            int suma = num1 + num2;
            JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        } else if (operacion == 'R') {
            int resta = num1 - num2;
            JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        } else if (operacion == 'P') {
            int producto = num1 * num2;
            JOptionPane.showMessageDialog(null, "El producto es: " + producto);
        } else if (operacion == 'D') {
            if (num2 != 0) {
                double division = (double) num1 / num2;
                JOptionPane.showMessageDialog(null, "La división es: " + division);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación no válida no exite esa operación.");
        }
    }
}
