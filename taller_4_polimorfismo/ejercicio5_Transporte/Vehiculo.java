public class Vehiculo {

    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void mover() {
        System.out.println("El vehiculo con placa " + placa + " se esta moviendo.");
    }
}
