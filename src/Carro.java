public class Carro extends Vehiculo {
    private int numeroPuertas;

    Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    void mostrarInfo() {
        System.out.println("El carro: " + marca + " de la linea " + modelo + " viene con " + numeroPuertas + " puertas");
    }
}