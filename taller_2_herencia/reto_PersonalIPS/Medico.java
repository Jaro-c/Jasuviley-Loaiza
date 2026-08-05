public class Medico extends PersonalIPS {

    private String especialidad;
    private int consultasDelMes;

    public Medico(String documento, String nombre, double salarioBase, String especialidad, int consultasDelMes) {
        super(documento, nombre, salarioBase);
        this.especialidad = especialidad;
        this.consultasDelMes = consultasDelMes;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase + (500000 * consultasDelMes);
    }
}
