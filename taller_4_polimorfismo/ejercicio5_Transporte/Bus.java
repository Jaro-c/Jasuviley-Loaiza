public class Bus extends Vehiculo {

    public Bus(String placa) {
        super(placa);
    }

    @Override
    public void mover() {
        System.out.println("El bus con placa " + placa + " avanza por su ruta.");
    }

    public void abrirPuertas() {
        System.out.println("El bus con placa " + placa + " abre sus puertas.");
    }
}
