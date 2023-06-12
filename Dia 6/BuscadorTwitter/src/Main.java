import java.util.Scanner;

public class Main {
    /*Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
    Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
    Después muestra en consola la concatenación de:
    “https://twitter.com/search?q=” + palabra*/
    public static void main(String[] args) {
        String palabra;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        System.out.println("https://twitter.com/search?q=" + palabra);
    }
}