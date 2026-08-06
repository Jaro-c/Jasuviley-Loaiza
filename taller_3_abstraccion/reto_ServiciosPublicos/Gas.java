public class Gas extends ServicioPublico {

    private static final double TARIFA_M3 = 2100;
    private static final double CARGO_FIJO = 5000;

    public Gas(String numeroContrato, String titular, double consumoDelMes) {
        super(numeroContrato, titular, consumoDelMes);
    }

    @Override
    public double calcularFactura() {
        return (consumoDelMes * TARIFA_M3) + CARGO_FIJO;
    }
}
