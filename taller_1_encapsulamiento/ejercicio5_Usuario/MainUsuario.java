public class MainUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("carlos.dev", "clave1234");

        System.out.println("Usuario: " + u.getNombreUsuario());

        u.cambiarPassword("hola");
        System.out.println("Login OK? " + u.verificarPassword("clave1234"));

        System.out.println("Intento 1: " + u.verificarPassword("mala1"));
        System.out.println("Intento 2: " + u.verificarPassword("mala2"));
        System.out.println("Intento 3: " + u.verificarPassword("mala3"));

        System.out.println("Bloqueado? " + (u.isBloqueado() ? "Si" : "No"));
        System.out.println("Login con clave correcta tras bloqueo? " + u.verificarPassword("clave1234"));
    }
}
