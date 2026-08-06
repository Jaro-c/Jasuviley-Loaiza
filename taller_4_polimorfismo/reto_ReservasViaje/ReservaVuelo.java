public class ReservaVuelo extends Reserva {

    private boolean internacional;
    private double distanciaKm;

    public ReservaVuelo(String id, String descripcion, boolean internacional, double distanciaKm) {
        super(id, descripcion);
        this.internacional = internacional;
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcularPrecio() {
        return distanciaKm * 500 + 150000;
    }

    public boolean esInternacional() {
        return internacional;
    }
}
