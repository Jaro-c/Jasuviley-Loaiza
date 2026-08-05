public class Gerente extends Empleado {

    private double bonificacion;

    public Gerente(String nombre, String documento, double salarioBase, double bonificacion) {
        super(nombre, documento, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }
}
