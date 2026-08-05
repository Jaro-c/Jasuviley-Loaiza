public class Carro extends Vehiculo {

    private int numeroPuertas;

    public Carro(String marca, String modelo, double precio, int numeroPuertas) {
        super(marca, modelo, precio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Carro - " + numeroPuertas + " puertas");
    }
}
