public abstract class Electrodomestico {

    protected String marca;
    protected boolean encendido;

    public Electrodomestico(String marca) {
        this.marca = marca;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println(marca + " se ha encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(marca + " se ha apagado.");
    }

    public abstract void funcionPrincipal();
}
