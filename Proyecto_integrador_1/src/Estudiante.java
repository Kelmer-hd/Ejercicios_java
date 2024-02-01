import java.util.Scanner;

public class Estudiante {
    static Scanner scanner = new Scanner(System.in);
    private static String nombre;
    private static String apellido;
    private static int edad;
    private static String direccion;

    public Estudiante(String nombre, String apellido, int edad, String direccion){
        this.nombre = nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.direccion= direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static void registrarEstudiante(){
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su Apellido:");
        apellido = scanner.nextLine();
        System.out.println("Digite su edad: ");
        edad = scanner.nextInt();
        System.out.println("Digite su direccion:");
        direccion = scanner.nextLine();
    }


}
