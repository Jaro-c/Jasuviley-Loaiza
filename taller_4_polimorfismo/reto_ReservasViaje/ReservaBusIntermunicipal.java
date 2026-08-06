public class ReservaBusIntermunicipal extends Reserva {

    private String origen;
    private String destino;
    private double precioFijo;

    public ReservaBusIntermunicipal(String id, String descripcion, String origen, String destino, double precioFijo) {
        super(id, descripcion);
        this.origen = origen;
        this.destino = destino;
        this.precioFijo = precioFijo;
    }

    @Override
    public double calcularPrecio() {
        return precioFijo;
    }
}
