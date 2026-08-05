public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto(String marca, String modelo, double precio, int cilindraje) {
        super(marca, modelo, precio);
        this.cilindraje = cilindraje;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Moto - " + cilindraje + " cc");
    }
}
