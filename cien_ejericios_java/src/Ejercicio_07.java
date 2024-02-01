import javax.swing.*;
import java.util.Scanner;

// Crear una calculadora simple con operaciones básicas.
public class Ejercicio_07 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un primer valor"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo valor"));

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor: \n 1: sumar \n 2:Restar " +
                "\n 3: Multiplicar \n 4: Dividir"));

        switch (opcion){
            case 1: JOptionPane.showMessageDialog(null, "La suma es: " + (num1 + num2));
            break;
            case 2: JOptionPane.showMessageDialog(null, "La resta es: " + (num1 - num2));
            break;
            case 3: JOptionPane.showMessageDialog(null, "La multiplicación es: " + (num1 * num2));
            break;
            case 4: JOptionPane.showMessageDialog(null, "La divición es: " + (num1 / num2));
            break;
            default: JOptionPane.showMessageDialog(null, "Error opcion INCORRECTA");
        }
    }
}
