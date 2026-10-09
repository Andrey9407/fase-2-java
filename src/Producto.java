public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor a 0");
        }
    }

    void aplicarDescuento(double porcentaje) {
        double total = precio * (1 - (porcentaje / 100));
        System.out.println("El valor a pagar por sus " + nombre + " con el "
                + porcentaje + "% de descuento es de $" + total);
    }
}
