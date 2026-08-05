public class MainCuenta {
    public static void main(String[] args) {
        CuentaBancaria origen = new CuentaBancaria("001-2345", "Carlos Perez");
        CuentaBancaria destino = new CuentaBancaria("002-9988", "Ana Torres");

        origen.depositar(500000);
        System.out.println("Saldo origen: $" + origen.getSaldo());
        System.out.println("Saldo destino: $" + destino.getSaldo());

        origen.transferir(destino, 200000);
        System.out.println("Saldo origen tras transferencia: $" + origen.getSaldo());
        System.out.println("Saldo destino tras transferencia: $" + destino.getSaldo());

        origen.transferir(destino, 999999);
        origen.transferir(destino, -100);
    }
}
