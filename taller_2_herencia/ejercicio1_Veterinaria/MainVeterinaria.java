public class MainVeterinaria {

    public static void main(String[] args) {

        Perro perro = new Perro("Firulais", 3);
        Gato gato = new Gato("Michi", 2);
        Pajaro pajaro = new Pajaro("Piolin", 1);

        System.out.println("--- Perro ---");
        perro.comer();
        perro.dormir();
        perro.hacerSonido();
        perro.perseguirCola();
        perro.presentarse();

        System.out.println("--- Gato ---");
        gato.comer();
        gato.dormir();
        gato.hacerSonido();
        gato.ronronear();
        gato.presentarse();

        System.out.println("--- Pajaro ---");
        pajaro.comer();
        pajaro.dormir();
        pajaro.hacerSonido();
        pajaro.volar();
        pajaro.presentarse();
    }
}
