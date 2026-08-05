public class Pajaro extends Animal {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad, "Ave");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Pio pio!");
    }

    public void volar() {
        System.out.println(nombre + " esta volando.");
    }
}
