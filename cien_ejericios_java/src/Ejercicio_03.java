import java.util.concurrent.LinkedBlockingDeque;

// Realizar una operación con variables de tipo char.
public class Ejercicio_03 {
    public static void main(String[] args) {
        char letra = 'c';
        String cadena = "Hola como estas";

        int indice = cadena.indexOf(letra);

        if (indice != -1){
            System.out.println("El caracter buscado fue encontrado en la posicion "+ indice);

        }else{
            System.out.println("El caracter buscado no fue encotrado");
        }


    }
}
