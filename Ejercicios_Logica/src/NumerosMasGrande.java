// Crea un programa que encuentre el número más grande en un arreglo dado
public class NumerosMasGrande {
    public static void main(String[] args) {

        int arregloNumeros[] = {22,4,32,12,43,100,9923};
        int mayor= 0;

        for (int i = 0; i < arregloNumeros.length; i++){
            if (arregloNumeros[i] > mayor){
                mayor = arregloNumeros[i];
            }
        }
        System.out.println("El números mayor de mi arrego es: " + mayor);

    }
}
