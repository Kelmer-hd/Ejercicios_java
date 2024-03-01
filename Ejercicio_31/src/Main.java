/*
    Construir un programa que visualice por pantalla todos los caracteres correspondientes a letras minúsculas.
*/
public class Main {
    public static void main(String[] args) {
        for (int i = 97; i <= 122; i++) {
            char c = (char) i; // Convertir el valor ASCII a un caracter
            System.out.print(c + " ");
        }

        // Esta es otra forma
        int ini = (int)'a', fin = (int)'z';

        for (int i = ini; i <= fin; i++) {
                System.out.print((char)i);
        }

    }
}
