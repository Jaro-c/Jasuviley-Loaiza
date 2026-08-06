public class NotificacionWhatsApp extends Notificacion {

    public NotificacionWhatsApp(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando WhatsApp a " + destinatario + ": " + mensaje);
        registrarEnvio();
    }
}
