import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese el primer numero:");
            int a = sc.nextInt();
            System.out.println("Ingrese el segundo numero:");
            int b = sc.nextInt();
            System.out.println("El resultado de la división es: " + a / b);
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un numero valido");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero, intente nuevamente");
        } finally {
            sc.close();
        }
    }
}