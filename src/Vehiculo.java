public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void mostrarMarcaModelo() {
        System.out.println("El vehiculo " + marca + " de la linea " + modelo);
    }

    abstract void mostrarInfo();
}