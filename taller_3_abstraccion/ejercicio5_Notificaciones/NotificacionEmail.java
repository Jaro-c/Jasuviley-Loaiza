public class NotificacionEmail extends Notificacion {

    public NotificacionEmail(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
        registrarEnvio();
    }
}
