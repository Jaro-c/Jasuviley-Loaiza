public abstract class MedioPago {

    protected double monto;

    public MedioPago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarMonto() {
        System.out.println("Monto a pagar: $" + monto);
    }
}
