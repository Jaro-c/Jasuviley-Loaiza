public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso de $" + cantidad);
        } else {
            System.out.println("Error: la cantidad debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        }
    }

    public boolean transferir(CuentaBancaria destino, double cantidad) {
        if (destino == null) {
            System.out.println("Error: cuenta destino inexistente.");
            return false;
        }
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a transferir debe ser positiva.");
            return false;
        }
        if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente para transferir.");
            return false;
        }
        saldo -= cantidad;
        destino.saldo += cantidad;
        System.out.println("Transferencia exitosa de $" + cantidad + " de " + numeroCuenta + " a " + destino.numeroCuenta);
        return true;
    }
}
