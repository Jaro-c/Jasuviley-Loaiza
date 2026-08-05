public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setPrecio(double precio) {
        if (precio >= 0) this.precio = precio;
        else System.out.println("Precio invalido.");
    }

    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
        else System.out.println("Stock invalido.");
    }

    public void vender(int unidades) {
        if (unidades <= 0) {
            System.out.println("Cantidad invalida.");
        } else if (unidades > stock) {
            System.out.println("Sin stock suficiente. Disponible: " + stock);
        } else {
            stock -= unidades;
            System.out.println("Venta realizada: " + unidades + " unidades.");
        }
    }

    public void reabastecer(int unidades) {
        if (unidades > 0) {
            stock += unidades;
            System.out.println("Stock actualizado. Nuevo stock: " + stock);
        }
    }

    public void aplicarDescuento(double porcentaje) {
        boolean rangoValido = porcentaje >= 0 && porcentaje <= 100;
        if (!rangoValido) {
            System.out.println("Porcentaje de descuento invalido. Debe estar entre 0 y 100.");
            return;
        }
        double factor = 1 - (porcentaje / 100.0);
        this.precio = this.precio * factor;
        System.out.println("Descuento aplicado. Nuevo precio: $" + precio);
    }

    public boolean hayStock() {
        return stock > 0;
    }
}
