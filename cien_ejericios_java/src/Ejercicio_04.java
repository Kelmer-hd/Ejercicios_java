import javax.swing.*;

// Convertir una temperatura de Celsius a Fahrenheit.
public class Ejercicio_04 {
    public static void main(String[] args) {
        double grados_celcius = Double.parseDouble(JOptionPane.showInputDialog("Digite los grados celcius: "));
        double resultado = (grados_celcius * 9/5) + 32;
        JOptionPane.showMessageDialog(null,"El resultaado de convertir  "+ grados_celcius + " °C " + " a Fahrenheit es: "+resultado);
    }
}
