import javax.swing.*;

// Desarrollar un sistema de ingreso con usuario y contraseña
public class Ejercicio_13 {
    public static void main(String[] args) {
        String usuario = "kelmer";
        String password = "1234kelmer";
        String ingreso_usuario;
        String password_usuario;
        String nombre;

        nombre = JOptionPane.showInputDialog("Digite su nombre ");
        ingreso_usuario = JOptionPane.showInputDialog("Digite su usario");
        password_usuario = JOptionPane.showInputDialog("Digite su password");

        if (ingreso_usuario.equals(usuario) && password_usuario.equals(password)){
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + nombre);

        }else if(!ingreso_usuario.equals(usuario) && password_usuario.equals(password)){
            JOptionPane.showMessageDialog(null, "El usuario es Incorrecto");

        } else if (ingreso_usuario.equals(usuario) && !password_usuario.equals(password)) {
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
        }else{
            JOptionPane.showMessageDialog(null, "El usuario y la contraseña son incorrectos");
        }

    }
}
