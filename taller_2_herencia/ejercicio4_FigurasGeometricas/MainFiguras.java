public class MainFiguras {

    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", 5);
        Rectangulo rectangulo = new Rectangulo("Azul", 4, 6);
        Triangulo triangulo = new Triangulo("Verde", 8, 3);

        circulo.describir();
        rectangulo.describir();
        triangulo.describir();
    }
}
