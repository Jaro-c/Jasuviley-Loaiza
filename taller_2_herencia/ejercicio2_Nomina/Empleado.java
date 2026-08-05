public class Empleado {

    protected String nombre;
    protected String documento;
    protected double salarioBase;

    public Empleado(String nombre, String documento, double salarioBase) {
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Salario a pagar: $" + calcularSalario());
    }
}
