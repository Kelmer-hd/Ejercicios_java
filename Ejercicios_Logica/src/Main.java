// Suma de números pares e impares:
//    Escribe un programa que sume los números pares e impares por separado de una lista dada.
public class Main {
    public static void main(String[] args) {
        int numero[] = {1,2,3,4,5,6,7};
        int sumarPares = 0;
        int sumarImpares = 0;

        for (int i = 0; i < numero.length; i++){
            if (numero[i] % 2 == 0){
                sumarPares += numero[i];
            }else{
                sumarImpares += numero[i];
            }
        }

        System.out.println("La suma de pares es : " + sumarPares);
        System.out.println("La suma de impares es: " + sumarImpares);
    }
}