public class MainNomina {

    public static void main(String[] args) {

        // --- Arreglo de empleados ---
        Empleado[] empleados = new Empleado[6];
        empleados[0] = new EmpleadoTiempoCompleto("Carlos Ramirez", 1800000);
        empleados[1] = new EmpleadoTiempoCompleto("Laura Gomez", 2000000);
        empleados[2] = new EmpleadoFreelance("Andres Torres", 4, 300000);
        empleados[3] = new EmpleadoFreelance("Sofia Diaz", 6, 250000);
        empleados[4] = new EmpleadoPorHoras("Juan Perez", 120, 15000);
        empleados[5] = new EmpleadoPorHoras("Marta Ruiz", 100, 18000);

        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            double salario = empleado.calcularSalario();
            System.out.println(empleado.getNombre() + " recibe un pago de: $" + salario);
            totalNomina += salario;
        }

        System.out.println("Total de la nomina: $" + totalNomina);
    }
}
