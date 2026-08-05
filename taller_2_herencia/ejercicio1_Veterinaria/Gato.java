public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad, "Gato");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau!");
    }

    public void ronronear() {
        System.out.println(nombre + " ronronea felizmente.");
    }
}
