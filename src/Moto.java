public class Moto extends Vehiculo {
    private int cilindraje;

    Moto(String marca, String modelo, int cilindraje) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }

    void mostrarInfo() {
        System.out.println("La moto: " + marca + " de la linea " + modelo + " tiene un cilindraje de " + cilindraje + " CC");
    }
}