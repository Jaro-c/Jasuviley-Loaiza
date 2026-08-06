public class MainCoro {

    public static void main(String[] args) {

        // --- Coro de animales ---
        Animal[] animales = new Animal[5];
        animales[0] = new Perro("Firulais");
        animales[1] = new Gato("Michi");
        animales[2] = new Vaca("Lola");
        animales[3] = new Loro("Paco");
        animales[4] = new Loro("Coco");

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
