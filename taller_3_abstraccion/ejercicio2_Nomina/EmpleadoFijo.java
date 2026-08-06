public class EmpleadoFijo extends Empleado {

    private double salarioMensual;

    public EmpleadoFijo(String nombre, String documento, double salarioMensual) {
        super(nombre, documento);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}
