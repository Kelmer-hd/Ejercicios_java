// Implementa un algoritmo de ordenamiento (como el de burbuja o selección) para ordenar una lista de números.

public class OrdenaLista {
    public static void main(String[] args) {

        int arregloNumeros [] = {12,20,2,4,17,5,1};
        int  aux;
        for ( int i = 0; i < arregloNumeros.length - 1; i++) {
            for (int j = 0; j < arregloNumeros.length - i - 1; j++) {
                if (arregloNumeros[j + 1] < arregloNumeros[j]) {
                    aux = arregloNumeros[j + 1];
                    arregloNumeros[j + 1] = arregloNumeros[j];
                    arregloNumeros[j] = aux;
                }
            }
        }

        System.out.print("\nVector ordenado: ");
        for(int i=0;i<arregloNumeros.length;i++){
            System.out.print(arregloNumeros[i]+" ");
        }

    }
}
