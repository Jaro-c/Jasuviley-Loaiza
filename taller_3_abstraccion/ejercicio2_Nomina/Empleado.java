public abstract class Empleado {

    protected String nombre;
    protected String documento;

    public Empleado(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public abstract double calcularPago();

    public void mostrarRecibo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Pago a recibir: $" + calcularPago());
    }
}
