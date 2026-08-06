public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    // Si esta clase no implementa calcularArea(), el compilador marca error:
    // "class Cuadrado is not abstract and does not override abstract method
    // calcularArea() in Figura". Por eso toca implementarlo aqui.
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
