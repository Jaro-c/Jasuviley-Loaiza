public class MainPlataforma {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Laura Gomez", "laura.gomez@correo.com", 4);
        Instructor instructor = new Instructor("Carlos Perez", "carlos.perez@correo.com", "Programacion Java");
        Administrador administrador = new Administrador("Ana Torres", "ana.torres@correo.com", "TOTAL");

        estudiante.iniciarSesion();
        System.out.println();

        instructor.iniciarSesion();
        System.out.println();

        administrador.iniciarSesion();
    }
}
