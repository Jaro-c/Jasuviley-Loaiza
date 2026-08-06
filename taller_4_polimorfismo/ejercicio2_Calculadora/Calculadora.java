public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public String sumar(String a, String b) {
        return a + " " + b;
    }

    public double sumar(int a, double b) {
        return a + b;
    }

    public int sumar(int[] numeros) {
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        return total;
    }
}
