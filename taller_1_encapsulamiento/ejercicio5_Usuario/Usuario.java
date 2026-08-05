public class Usuario {
    private String nombreUsuario;
    private String password;
    private int intentosFallidos;
    private boolean bloqueado;

    private static final int MAX_INTENTOS = 3;

    public Usuario(String nombreUsuario, String passwordInicial) {
        this.nombreUsuario = nombreUsuario;
        this.intentosFallidos = 0;
        this.bloqueado = false;
        cambiarPassword(passwordInicial);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void cambiarPassword(String nueva) {
        if (esPasswordValida(nueva)) {
            this.password = nueva;
            System.out.println("Contrasena actualizada correctamente.");
        } else {
            System.out.println("Contrasena invalida: min 8 caracteres " +
                                "y al menos un numero.");
        }
    }

    public boolean verificarPassword(String intento) {
        if (bloqueado) {
            System.out.println("Cuenta bloqueada por intentos fallidos.");
            return false;
        }

        boolean coincide = this.password != null && this.password.equals(intento);
        if (coincide) {
            intentosFallidos = 0;
            return true;
        }

        intentosFallidos++;
        if (intentosFallidos >= MAX_INTENTOS) {
            bloqueado = true;
            System.out.println("Cuenta bloqueada tras " + MAX_INTENTOS + " intentos fallidos.");
        }
        return false;
    }

    private boolean esPasswordValida(String pass) {
        if (pass == null || pass.length() < 8) return false;
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
}
