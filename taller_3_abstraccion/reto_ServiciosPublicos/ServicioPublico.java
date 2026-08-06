public abstract class ServicioPublico {

    protected String numeroContrato;
    protected String titular;
    protected double consumoDelMes;

    public ServicioPublico(String numeroContrato, String titular, double consumoDelMes) {
        this.numeroContrato = numeroContrato;
        this.titular = titular;
        this.consumoDelMes = consumoDelMes;
    }

    public abstract double calcularFactura();

    public void emitirRecibo() {
        System.out.println("Contrato: " + numeroContrato);
        System.out.println("Titular: " + titular);
        System.out.println("Consumo del mes: " + consumoDelMes);
        System.out.println("Total a pagar: $" + calcularFactura());
    }
}
