public class MainConcesionaria {

    public static void main(String[] args) {

        Carro carro = new Carro("Mazda", "3", 75000.0, 4);
        Moto moto = new Moto("Yamaha", "MT-03", 18500.0, 321);
        Camioneta camioneta = new Camioneta("Toyota", "Hilux", 145000.0, 1000);

        carro.describir();
        moto.describir();
        camioneta.describir();
    }
}
