public class EmpleadoFreelance extends Empleado {

    private int proyectos;
    private double pagoPorProyecto;

    public EmpleadoFreelance(String nombre, String documento, int proyectos, double pagoPorProyecto) {
        super(nombre, documento);
        this.proyectos = proyectos;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularPago() {
        return proyectos * pagoPorProyecto;
    }
}
