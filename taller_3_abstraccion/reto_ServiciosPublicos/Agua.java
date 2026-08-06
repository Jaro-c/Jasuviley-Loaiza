public class Agua extends ServicioPublico {

    private static final double TARIFA_M3 = 3500;
    private static final double CARGO_FIJO = 8000;

    public Agua(String numeroContrato, String titular, double consumoDelMes) {
        super(numeroContrato, titular, consumoDelMes);
    }

    @Override
    public double calcularFactura() {
        return (consumoDelMes * TARIFA_M3) + CARGO_FIJO;
    }
}
