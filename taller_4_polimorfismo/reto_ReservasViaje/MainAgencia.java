public class MainAgencia {

    public static void main(String[] args) {

        // --- Arreglo de reservas ---
        Reserva[] reservas = new Reserva[6];
        reservas[0] = new ReservaVuelo("V-001", "Vuelo a Madrid", true, 8000);
        reservas[1] = new ReservaVuelo("V-002", "Vuelo a Bogota", false, 400);
        reservas[2] = new ReservaHotel("H-001", "Hotel en Cartagena", 3, 180000);
        reservas[3] = new ReservaHotel("H-002", "Hotel en Medellin", 2, 150000);
        reservas[4] = new ReservaBusIntermunicipal("B-001", "Bus a Bucaramanga", "Cucuta", "Bucaramanga", 60000);
        reservas[5] = new ReservaBusIntermunicipal("B-002", "Bus a Pamplona", "Cucuta", "Pamplona", 25000);

        double totalCarrito = 0;
        for (Reserva reserva : reservas) {
            double precio = reserva.calcularPrecio();
            System.out.println(reserva.descripcion + " - Precio: $" + precio);

            if (reserva instanceof ReservaVuelo) {
                ReservaVuelo vuelo = (ReservaVuelo) reserva;
                if (vuelo.esInternacional()) {
                    System.out.println("Este vuelo es internacional.");
                } else {
                    System.out.println("Este vuelo es nacional.");
                }
            }

            totalCarrito += precio;
        }

        System.out.println("Total del carrito: $" + totalCarrito);
    }
}
