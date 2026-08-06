public class MainServicios {

    public static void main(String[] args) {

        // new ServicioPublico("0001", "Juan Perez", 10); // ERROR: cannot instantiate the type ServicioPublico
        // No se puede instanciar porque ServicioPublico es una clase abstracta.

        Agua agua = new Agua("AC-001", "Juan Perez", 15);
        Luz luz = new Luz("LZ-002", "Laura Gomez", 250);
        Gas gas = new Gas("GA-003", "Carlos Ramirez", 12);

        System.out.println("--- Recibo de Agua ---");
        agua.emitirRecibo();

        System.out.println();
        System.out.println("--- Recibo de Luz ---");
        luz.emitirRecibo();

        System.out.println();
        System.out.println("--- Recibo de Gas ---");
        gas.emitirRecibo();
    }
}
