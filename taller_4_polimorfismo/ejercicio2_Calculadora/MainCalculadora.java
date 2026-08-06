public class MainCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        // --- Sobrecargas basicas ---
        System.out.println("Suma de 2 enteros: " + calculadora.sumar(5, 3));
        System.out.println("Suma de 3 enteros: " + calculadora.sumar(5, 3, 2));
        System.out.println("Suma de 2 decimales: " + calculadora.sumar(5.5, 3.2));
        System.out.println("Concatenar textos: " + calculadora.sumar("Hola", "mundo"));

        // --- Sobrecargas nuevas ---
        System.out.println("Suma de entero y decimal: " + calculadora.sumar(5, 3.5));

        int[] numeros = {2, 4, 6, 8};
        System.out.println("Suma de un arreglo: " + calculadora.sumar(numeros));
    }
}
