package p2_conversormitokm;
import java.util.Scanner;

public class Main {
    /*Conversor de millas a kilómetros:
    Pídele al usuario que ingrese una distancia en millas.
    Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
    Muestra la distancia en kilómetros al usuario.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double km, mi;
        System.out.println("Ingrese una distancia en millas");
        mi = leer.nextFloat();
        km = mi * 1.60934;
        System.out.println("La distancia "+ mi + "mi en km es: " + km+"km");
    }
}
