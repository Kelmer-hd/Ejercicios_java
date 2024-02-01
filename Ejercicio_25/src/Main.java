public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Kelmer", 24, "kelmer@gmail.com");
        System.out.println(persona.getInformacion());
        persona.setCorreo_electronico("Karen@gmail.com");
        System.out.println(persona.getInformacion());
    }
}