public abstract class Notificacion {

    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public abstract void enviar();

    public void registrarEnvio() {
        System.out.println("Log: notificacion enviada a " + destinatario + ".");
    }
}
