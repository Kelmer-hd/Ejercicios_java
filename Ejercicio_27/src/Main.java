/*
    Ejercicio 3: Construir un programa que, dado el radio de una esfera, calcule y devuelva por pantalla
    el valor de la superficie y el volumen de la esfera correspondiente. Para obtener el valor de PI,
    utilizar la variable estática Math.PI.
        Volumen esfera = (4/3)PIR3
        superficie esfera = 4PIR2
*/
public class Main {
    public static void main(String[] args) {
        double radioEsfera = 12;

        double volumenEsfera = (4.0/3.0) * Math.PI * Math.pow(radioEsfera, 3);
        //double volumenEsfera = (4/3)* (Math.PI) * Math.pow(radioEsfera, 3);
        double superfEsfera = 4*(Math.PI) * Math.pow(radioEsfera, 2);
        System.out.println("El volumen de  la esfera es: "+volumenEsfera);
        System.out.println("La superficie de la esfera es: "+superfEsfera);
    }
}