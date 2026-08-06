public class MainAreas {

    public static void main(String[] args) {

        // --- Arreglo de figuras ---
        Figura[] figuras = new Figura[5];
        figuras[0] = new Cuadrado(4);
        figuras[1] = new Circulo(3);
        figuras[2] = new Triangulo(6, 5);
        figuras[3] = new Rectangulo(4, 7);
        figuras[4] = new Rectangulo(2, 9);

        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        System.out.println("Area total de todas las figuras: " + areaTotal);

        // --- Reto: figura con mayor area ---
        Figura mayor = encontrarMayorArea(figuras);
        System.out.println("La figura con mayor area tiene un area de: " + mayor.calcularArea());
    }

    public static Figura encontrarMayorArea(Figura[] figuras) {
        Figura mayor = figuras[0];
        for (Figura figura : figuras) {
            if (figura.calcularArea() > mayor.calcularArea()) {
                mayor = figura;
            }
        }
        return mayor;
    }
}
