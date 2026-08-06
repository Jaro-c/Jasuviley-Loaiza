public class PagoEfectivo extends MedioPago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        int codigoRecaudo = (int) (Math.random() * 900000) + 100000;
        System.out.println("Genere el codigo de recaudo " + codigoRecaudo + ".");
        System.out.println("Paga $" + monto + " en un punto Efecty con ese codigo.");
    }
}
