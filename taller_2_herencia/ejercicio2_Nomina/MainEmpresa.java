public class MainEmpresa {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Carlos Ramirez", "1091234567", 1200000, 300000);
        Gerente gerente = new Gerente("Laura Gomez", "1098765432", 2500000, 800000);
        AprendizSena aprendiz = new AprendizSena("Juan Perez", "1005678901", 1160000);

        System.out.println("--- Nomina Empresa de Cucuta ---");

        System.out.println();
        vendedor.mostrarInfo();

        System.out.println();
        gerente.mostrarInfo();

        System.out.println();
        aprendiz.mostrarInfo();
    }
}
