public class Camioneta extends Vehiculo {

    private double capacidadCarga;

    public Camioneta(String marca, String modelo, double precio, double capacidadCarga) {
        super(marca, modelo, precio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Camioneta - " + capacidadCarga + " kg de carga");
    }
}
