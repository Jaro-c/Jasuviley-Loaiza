public class MainProducto {
    public static void main(String[] args) {
        Producto p = new Producto("P-001", "Teclado Mecanico", 180000, 10);

        System.out.println("Producto: " + p.getNombre());
        System.out.println("Precio: $" + p.getPrecio());
        System.out.println("Stock: " + p.getStock());

        p.vender(3);
        p.vender(20);
        p.reabastecer(5);

        p.aplicarDescuento(15);
        p.aplicarDescuento(150);

        System.out.println("Precio final: $" + p.getPrecio());
        System.out.println("Stock final: " + p.getStock());
        System.out.println("Hay stock disponible? " + (p.hayStock() ? "Si" : "No"));
    }
}
