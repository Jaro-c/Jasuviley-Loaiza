public class Usuario {

    protected String nombre;
    protected String correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void iniciarSesion() {
        System.out.println("Bienvenido, " + nombre);
    }
}
