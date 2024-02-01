import javax.swing.*;

// Determinar si un número es par o impar.
public class Ejercicio_05 {
    public static void main(String[] args) {
        int verificarNumero;

        verificarNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número a verificar"));

        if (verificarNumero % 2 == 0){
            JOptionPane.showMessageDialog(null, "El número " + verificarNumero + " es par");

        }else{
            JOptionPane.showMessageDialog(null, "El número " + verificarNumero + " es impar");
        }
    }
}
