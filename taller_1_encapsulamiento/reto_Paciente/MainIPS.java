public class MainIPS {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("1098765432", "Jorge Ramirez", 34, "O+");

        String diagnosticoNegado = paciente.consultarDiagnostico("clave-falsa");
        System.out.println("Diagnostico con clave incorrecta: " + diagnosticoNegado);

        paciente.actualizarDiagnostico("MED-2026", "Hipertension controlada");
        String diagnostico = paciente.consultarDiagnostico("MED-2026");
        System.out.println("Diagnostico con clave correcta: " + diagnostico);

        paciente.agregarAlergia("Penicilina");
        paciente.agregarAlergia("Polen");

        System.out.println();
        paciente.mostrarInformacionPublica();
    }
}
