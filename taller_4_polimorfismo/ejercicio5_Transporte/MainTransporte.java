public class MainTransporte {

    public static void main(String[] args) {

        // --- Arreglo de vehiculos ---
        Vehiculo[] vehiculos = new Vehiculo[5];
        vehiculos[0] = new Bus("BUS-001");
        vehiculos[1] = new Taxi("TAX-002");
        vehiculos[2] = new Bicicleta("BIC-003");
        vehiculos[3] = new MotoTaxi("MOT-004");
        vehiculos[4] = new MotoTaxi("MOT-005");

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();

            if (vehiculo instanceof Bus) {
                Bus bus = (Bus) vehiculo;
                bus.abrirPuertas();
            }

            if (vehiculo instanceof MotoTaxi) {
                MotoTaxi motoTaxi = (MotoTaxi) vehiculo;
                motoTaxi.recogerPasajero();
            }
        }
    }
}
