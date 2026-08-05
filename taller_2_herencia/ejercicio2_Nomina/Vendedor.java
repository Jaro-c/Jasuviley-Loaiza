public class Vendedor extends Empleado {

    private double comision;

    public Vendedor(String nombre, String documento, double salarioBase, double comision) {
        super(nombre, documento, salarioBase);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}
