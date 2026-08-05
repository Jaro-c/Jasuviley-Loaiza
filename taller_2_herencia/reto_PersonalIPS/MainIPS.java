public class MainIPS {

    public static void main(String[] args) {

        Medico medico = new Medico("1001", "Carlos Ramirez", 1500000, "Pediatria", 20);
        Enfermero enfermero = new Enfermero("1002", "Laura Gomez", 1300000, "noche");
        Administrativo administrativo = new Administrativo("1003", "Andres Torres", 1400000, "facturacion");

        System.out.println("--- Informacion del Medico ---");
        medico.registrarAsistencia();
        medico.mostrarInfo();

        System.out.println();
        System.out.println("--- Informacion del Enfermero ---");
        enfermero.registrarAsistencia();
        enfermero.mostrarInfo();

        System.out.println();
        System.out.println("--- Informacion del Administrativo ---");
        administrativo.registrarAsistencia();
        administrativo.mostrarInfo();
    }
}
