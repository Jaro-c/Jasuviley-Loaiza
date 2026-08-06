public class ReservaHotel extends Reserva {

    private int noches;
    private double precioPorNoche;

    public ReservaHotel(String id, String descripcion, int noches, double precioPorNoche) {
        super(id, descripcion);
        this.noches = noches;
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public double calcularPrecio() {
        return noches * precioPorNoche;
    }
}
