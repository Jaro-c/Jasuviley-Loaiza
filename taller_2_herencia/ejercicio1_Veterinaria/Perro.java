public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad, "Perro");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }

    public void perseguirCola() {
        System.out.println(nombre + " persigue su cola.");
    }
}
