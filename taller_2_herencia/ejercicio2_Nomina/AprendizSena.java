public class AprendizSena extends Empleado {

    public AprendizSena(String nombre, String documento, double salarioBase) {
        super(nombre, documento, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.5;
    }
}
