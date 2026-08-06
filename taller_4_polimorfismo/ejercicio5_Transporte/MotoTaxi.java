public class MotoTaxi extends Vehiculo {

    public MotoTaxi(String placa) {
        super(placa);
    }

    @Override
    public void mover() {
        System.out.println("La mototaxi con placa " + placa + " se abre paso entre el trafico.");
    }

    public void recogerPasajero() {
        System.out.println("La mototaxi con placa " + placa + " recoge un pasajero.");
    }
}
