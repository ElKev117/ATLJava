package p1_calculadora;

import java.util.Scanner;

public class Main {
    /*1) Calculadora de edad de perros:
    Pídele al usuario que ingrese la edad de su perro.
    Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad de su perro");
        edad = leer.nextInt();
        edad = edad*7;
        System.out.println("La edad de tu perro en años de perro es "+ edad);
    }
}
