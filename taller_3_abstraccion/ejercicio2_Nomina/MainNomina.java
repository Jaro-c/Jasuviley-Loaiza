public class MainNomina {

    public static void main(String[] args) {

        EmpleadoFijo empleadoFijo = new EmpleadoFijo("Carlos Ramirez", "1091234567", 1800000);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Laura Gomez", "1098765432", 96, 12000);
        EmpleadoFreelance empleadoFreelance = new EmpleadoFreelance("Juan Perez", "1005678901", 3, 500000);

        System.out.println("--- Nomina ---");

        System.out.println();
        empleadoFijo.mostrarRecibo();

        System.out.println();
        empleadoPorHoras.mostrarRecibo();

        System.out.println();
        empleadoFreelance.mostrarRecibo();
    }
}
