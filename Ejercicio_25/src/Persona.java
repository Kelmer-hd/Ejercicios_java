public class Persona {
    private String nombre;
    private int edad;
    private String correo_electronico;

    public Persona(String nombre, int edad, String correo_electronico){
        this.nombre = nombre;
        this.edad = edad;
        this.correo_electronico = correo_electronico;
    }

    public Persona(){

    }

    public String getInformacion(){
        return "Nombre: "+nombre+ " \nEdad: "+edad + "\nCorreo: "+correo_electronico;
    }

    public void setCorreo_electronico(String correoElectronico){
        this.correo_electronico = correo_electronico;
    }
}
