public class Reserva {

    protected String id;
    protected String descripcion;

    public Reserva(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public double calcularPrecio() {
        return 0;
    }
}
