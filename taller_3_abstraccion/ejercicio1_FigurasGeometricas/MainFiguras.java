public class MainFiguras {

    public static void main(String[] args) {

        // Figura f = new Figura("X"); // ERROR: no se puede instanciar una clase abstracta

        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(8, 3);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Cuadrado cuadrado = new Cuadrado(4);

        System.out.println("--- Figuras ---");
        circulo.mostrar();
        triangulo.mostrar();
        rectangulo.mostrar();
        cuadrado.mostrar();
    }
}
