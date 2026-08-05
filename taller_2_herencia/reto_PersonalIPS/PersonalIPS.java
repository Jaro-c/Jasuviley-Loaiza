public class PersonalIPS {

    protected String documento;
    protected String nombre;
    protected double salarioBase;

    public PersonalIPS(String documento, String nombre, double salarioBase) {
        this.documento = documento;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void registrarAsistencia() {
        System.out.println(nombre + " registro su asistencia.");
    }

    public double calcularSalarioMensual() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario mensual: $" + (long) calcularSalarioMensual());
    }
}
