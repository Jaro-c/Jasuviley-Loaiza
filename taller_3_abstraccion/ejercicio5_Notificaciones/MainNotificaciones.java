public class MainNotificaciones {

    public static void main(String[] args) {

        NotificacionEmail notificacionEmail = new NotificacionEmail("juan.perez@correo.com", "Su pedido ha sido enviado.");
        NotificacionSMS notificacionSMS = new NotificacionSMS("3001234567", "Su cita es mañana a las 8:00 am.");
        NotificacionWhatsApp notificacionWhatsApp = new NotificacionWhatsApp("3109876543", "Su factura ya esta disponible.");

        System.out.println("--- Notificacion por Email ---");
        notificacionEmail.enviar();

        System.out.println();
        System.out.println("--- Notificacion por SMS ---");
        notificacionSMS.enviar();

        System.out.println();
        System.out.println("--- Notificacion por WhatsApp ---");
        notificacionWhatsApp.enviar();
    }
}
