public class Luz extends ServicioPublico {

    private static final double TARIFA_KWH = 650;
    private static final double CARGO_FIJO = 12000;

    public Luz(String numeroContrato, String titular, double consumoDelMes) {
        super(numeroContrato, titular, consumoDelMes);
    }

    @Override
    public double calcularFactura() {
        return (consumoDelMes * TARIFA_KWH) + CARGO_FIJO;
    }
}
