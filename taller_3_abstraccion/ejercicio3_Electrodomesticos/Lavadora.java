public class Lavadora extends Electrodomestico {

    public Lavadora(String marca) {
        super(marca);
    }

    @Override
    public void funcionPrincipal() {
        if (encendido) {
            System.out.println(marca + " esta lavando ropa a 40 grados C durante 45 minutos.");
        } else {
            System.out.println(marca + " esta apagada, enciendala primero.");
        }
    }

    public void centrifugar() {
        if (encendido) {
            System.out.println(marca + " esta centrifugando la ropa.");
        } else {
            System.out.println(marca + " esta apagada, enciendala primero.");
        }
    }
}
