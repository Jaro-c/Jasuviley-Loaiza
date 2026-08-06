public class MainTienda {

    public static void main(String[] args) {

        TarjetaCredito tarjetaCredito = new TarjetaCredito(150000, "4551-2233-4455-6677");
        PagoEfectivo pagoEfectivo = new PagoEfectivo(80000);
        PagoPSE pagoPSE = new PagoPSE(220000, "Bancolombia");

        System.out.println("--- Tarjeta de Credito ---");
        tarjetaCredito.mostrarMonto();
        tarjetaCredito.procesarPago();

        System.out.println();
        System.out.println("--- Pago en Efectivo ---");
        pagoEfectivo.mostrarMonto();
        pagoEfectivo.procesarPago();

        System.out.println();
        System.out.println("--- Pago PSE ---");
        pagoPSE.mostrarMonto();
        pagoPSE.procesarPago();
    }
}
