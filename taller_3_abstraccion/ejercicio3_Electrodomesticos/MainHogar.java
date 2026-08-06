public class MainHogar {

    public static void main(String[] args) {

        Televisor televisor = new Televisor("Samsung");
        Nevera nevera = new Nevera("Whirlpool");
        Lavadora lavadora = new Lavadora("LG");

        System.out.println("--- Televisor ---");
        televisor.encender();
        televisor.funcionPrincipal();
        televisor.apagar();

        System.out.println();
        System.out.println("--- Nevera ---");
        nevera.funcionPrincipal();
        nevera.encender();
        nevera.funcionPrincipal();

        System.out.println();
        System.out.println("--- Lavadora ---");
        lavadora.encender();
        lavadora.funcionPrincipal();
        lavadora.centrifugar();
    }
}
