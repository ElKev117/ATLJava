import java.util.Scanner;

public class Main {
    /*Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
    Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
    Después muestra en consola la concatenación de:
    “https://api.whatsapp.com/send?phone=” + telefono*/
    public static void main(String[] args) {
        String telefono;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de WhatsApp que desea llamar(Ingrese el numero sin espacios,por ejemplo: 5493541539405 ");
        telefono=leer.next();
        System.out.println("https://api.whatsapp.com/send?phone="+telefono);
    }
}