public class Nevera extends Electrodomestico {

    public Nevera(String marca) {
        super(marca);
    }

    @Override
    public void funcionPrincipal() {
        if (encendido) {
            System.out.println(marca + " esta enfriando los alimentos.");
        } else {
            System.out.println(marca + " esta apagada, enciendala primero.");
        }
    }
}
