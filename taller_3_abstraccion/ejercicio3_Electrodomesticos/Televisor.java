public class Televisor extends Electrodomestico {

    private int canal;

    public Televisor(String marca) {
        super(marca);
        this.canal = 1;
    }

    @Override
    public void funcionPrincipal() {
        if (encendido) {
            System.out.println(marca + " esta mostrando el canal " + canal + ".");
        } else {
            System.out.println(marca + " esta apagado, enciendalo primero.");
        }
    }

    public void cambiarCanal(int canal) {
        this.canal = canal;
    }
}
