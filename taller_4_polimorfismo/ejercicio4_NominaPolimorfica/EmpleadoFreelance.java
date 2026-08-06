public class EmpleadoFreelance extends Empleado {

    private int proyectos;
    private double pagoPorProyecto;

    public EmpleadoFreelance(String nombre, int proyectos, double pagoPorProyecto) {
        super(nombre);
        this.proyectos = proyectos;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularSalario() {
        return proyectos * pagoPorProyecto;
    }
}
