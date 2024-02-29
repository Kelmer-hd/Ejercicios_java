import  javax.swing.*;
/*
    Construir un programa que dado el peso (en kilogramos) y la altura de una persona (en metros)
    calcule y muestre por pantalla su Indice de Masa Corporal (IMS) o índice de Quetelet.
    Este índice pretende determinar el intervalo de peso más saludable que puede tener una persona.
    El valor de este índice se calcula mediante la siguiente expresión:

*/
public class Main {
    public static void main(String[] args) {
        double peso= Double.parseDouble(JOptionPane.showInputDialog("Digite su peso en KG "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite su talla en M"));

        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5){
            JOptionPane.showMessageDialog(null, "Tiene Bajo Peso");
        } else if (imc  >= 18.5 && imc < 24.9) {
            JOptionPane.showMessageDialog(null, "Normal");
        } else if (imc > 24.9 && imc <= 29.9 ) {
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Obecidad I");
        } else if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Obecidad II");
        } else if (imc >= 40 && imc <= 49.9) {
            JOptionPane.showMessageDialog(null, "Obecidad III");
        }else{
            JOptionPane.showMessageDialog(null, "Obecidad IV");
        }
    }
}