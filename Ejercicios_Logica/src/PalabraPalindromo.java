//Crea una función que verifique si una palabra o frase es un palíndromo.
public class PalabraPalindromo {
    public static void main(String[] args) {
        String palabra = "Kelmer";

        if (esPalindromo(palabra)) {
            System.out.println("'" + palabra + "' es un palíndromo.");
        } else {
            System.out.println("'" + palabra + "' no es un palíndromo.");
        }

    }

    public static boolean esPalindromo(String palabra) {
        // Eliminar espacios y convertir a minúsculas para hacer la comparación insensible a mayúsculas y minúsculas
        String palabraFormateada = palabra.replaceAll("\\s", "").toLowerCase();

        // Obtener la longitud de la palabra formateada
        int longitud = palabraFormateada.length();

        // Verificar si la palabra es un palíndromo comparando los caracteres desde el principio y el final
        for (int i = 0; i < longitud / 2; i++) {
            if (palabraFormateada.charAt(i) != palabraFormateada.charAt(longitud - 1 - i)) {
                return false; // No es un palíndromo
            }
        }

        return true; // Es un palíndromo
    }
}
