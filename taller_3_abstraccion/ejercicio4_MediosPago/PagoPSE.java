public class PagoPSE extends MedioPago {

    private String banco;

    public PagoPSE(double monto, String banco) {
        super(monto);
        this.banco = banco;
    }

    @Override
    public void procesarPago() {
        System.out.println("Redirigiendo a la pagina del banco " + banco + "...");
        System.out.println("Esperando confirmacion del banco...");
        System.out.println("Pago de $" + monto + " por PSE aprobado.");
    }
}
