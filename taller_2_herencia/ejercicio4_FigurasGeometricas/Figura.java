public class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0;
    }

    public String getColor() {
        return color;
    }

    public void describir() {
        System.out.println("Figura de color " + color + " - Area: " + calcularArea());
    }
}
