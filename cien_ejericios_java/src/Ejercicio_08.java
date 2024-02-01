import javax.swing.*;

// Verificar si un año es bisiesto.
public class Ejercicio_08 {
    public static void main(String[] args) {
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite un año"));
        if (anio % 4 == 0){
            if (anio % 100 != 0 || anio % 400 == 0){
                JOptionPane.showMessageDialog(null, "El año " + anio + " es Bisiesto");
            }else{
                JOptionPane.showMessageDialog(null, "El año " + anio + " no es Bisiesto");

            }
        }
    }
}
