import java.util.Scanner;

public class Main {
    /*Arma un buscador de países con Google Maps.
    Primero, pidele al usuario que ingrese un país (Ej: Colombia).
    Después muestra en consola la concatenación de:
    “https://www.google.com/maps/search/” + pais
    Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.*/

    public static void main(String[] args) {
        String pais;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el pais que deseas buscar");
        pais = leer.next();
        System.out.println("https://www.google.com/maps/search/" + pais);
    }
}