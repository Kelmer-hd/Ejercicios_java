import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("***** Bienvenido al sistema *****");
            System.out.println("1: Registrar Estudiante ");
            System.out.println("2: Buscar estudiante");
            System.out.println("3: Eliminar Estudiante");
            System.out.println("4: Editar Estudiante");
            System.out.println("5: Salir del sistema");
            System.out.print("Digite una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Estudiante.registrarEstudiante();
                    break;

                case 5:
                    System.exit(0);


            }
        }
    }

}