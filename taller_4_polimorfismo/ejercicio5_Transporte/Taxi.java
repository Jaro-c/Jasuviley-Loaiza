public class Taxi extends Vehiculo {

    public Taxi(String placa) {
        super(placa);
    }

    @Override
    public void mover() {
        System.out.println("El taxi con placa " + placa + " circula por la ciudad.");
    }
}
