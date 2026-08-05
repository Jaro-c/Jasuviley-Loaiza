public class Animal {

    protected String nombre;
    protected int edad;
    protected String especie;

    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }

    public void hacerSonido() {
        System.out.println(nombre + " emite un sonido.");
    }

    public void presentarse() {
        System.out.println("Soy " + nombre + ", una/un " + especie + " de " + edad + " años.");
    }
}
