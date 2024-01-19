public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Kelmer");
        estudiante1.setEdad(24);
        estudiante1.setNota(8.2);
        estudiante1.imprimirInformacion();
        System.out.println(estudiante1.aprobo());
        System.out.println("****************************************************");
        Estudiante estudiante2 = new Estudiante("karen", 21, 4.2);
        estudiante2.imprimirInformacion();
        System.out.println(estudiante2.aprobo());
    }
}