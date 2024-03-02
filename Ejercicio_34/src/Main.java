/*
    Definir un array bidimensional para representar una agenda semanal, donde se contemplen los 7 días de la semana
    y las 24 horas de cada día. Utilizar bucles for anidados para inicializar la agenda a: "No tengo planes.".
    Añadir "planes" a la agenda y mostrar el resultado por pantalla.
*/
public class Main {
    public static void main(String[] args) {
        String agenda[][] = new String [7][24];

        // for para recorrer los dias
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                agenda[i][j] = "No tengo planes.";
            }
        }

        int dia = 0;
        int hora = 15;

        for (int i = 0; i < 7 ; i++){
            for (int j = 0; j < 24; j++){
                System.out.println("Día " + i + ", Hora " + j + ": " + agenda[i][j]);
            }
        }


    }
}
