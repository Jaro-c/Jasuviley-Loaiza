import java.util.Arrays;

public class Paciente {
    private static final String[] TIPOS_SANGRE_VALIDOS =
        {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
    private static final String CLAVE_MEDICO = "MED-2026";

    private String documento;
    private String nombre;
    private int edad;
    private String tipoSangre;
    private String diagnostico;
    private String[] alergias;

    public Paciente(String documento, String nombre, int edad, String tipoSangre) {
        this.documento = documento;
        this.nombre = nombre;
        this.alergias = new String[0];
        this.diagnostico = "";
        setEdad(edad);
        setTipoSangre(tipoSangre);
    }

    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTipoSangre() { return tipoSangre; }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida. Debe estar entre 0 y 120.");
        }
    }

    public void setTipoSangre(String tipoSangre) {
        boolean esValido = false;
        for (String tipo : TIPOS_SANGRE_VALIDOS) {
            if (tipo.equals(tipoSangre)) {
                esValido = true;
                break;
            }
        }
        if (esValido) {
            this.tipoSangre = tipoSangre;
        } else {
            System.out.println("Tipo de sangre invalido. Valores permitidos: " +
                                Arrays.toString(TIPOS_SANGRE_VALIDOS));
        }
    }

    public String consultarDiagnostico(String claveMedico) {
        if (!CLAVE_MEDICO.equals(claveMedico)) {
            System.out.println("Acceso denegado: clave de medico incorrecta.");
            return null;
        }
        return diagnostico;
    }

    public void actualizarDiagnostico(String claveMedico, String nuevoDiagnostico) {
        if (!CLAVE_MEDICO.equals(claveMedico)) {
            System.out.println("Acceso denegado: no se puede actualizar el diagnostico.");
            return;
        }
        this.diagnostico = nuevoDiagnostico;
        System.out.println("Diagnostico actualizado correctamente.");
    }

    public void agregarAlergia(String alergia) {
        if (alergia == null || alergia.isBlank()) {
            System.out.println("Alergia invalida.");
            return;
        }
        alergias = Arrays.copyOf(alergias, alergias.length + 1);
        alergias[alergias.length - 1] = alergia;
        System.out.println("Alergia registrada: " + alergia);
    }

    public boolean tieneAlergias() {
        return alergias.length > 0;
    }

    public String[] getAlergias() {
        return Arrays.copyOf(alergias, alergias.length);
    }

    public void mostrarInformacionPublica() {
        System.out.println("Documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo de sangre: " + tipoSangre);
        System.out.println("Tiene alergias? " + (tieneAlergias() ? "Si" : "No"));
        System.out.println("Alergias: " + Arrays.toString(getAlergias()));
    }
}
