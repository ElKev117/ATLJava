package p4_calculadorapropinas;

import java.util.Scanner;

public class Main {
    /*Pídele al usuario que ingrese el total de la cuenta en un restaurante.
    Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
    Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).*/

    public static void main(String[] args) {
        double totalCuenta, propina;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta");
        totalCuenta = leer.nextDouble();
        System.out.println("Ingrese el porcentaje de la propina");
        propina = leer.nextDouble();
        propina = totalCuenta * (propina/100);
        System.out.println("La propina que dejas es de " + propina + "$");
    }
}
