package gestion_estudianes;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private int num_identificacion;

    public Estudiante(String nombre, String apellido, int edad, int num_identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.num_identificacion = num_identificacion;
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

    public int getNum_identificacion() {
        return num_identificacion;
    }

    public void setNum_identificacion(int num_identificacion) {
        this.num_identificacion = num_identificacion;
    }
}
