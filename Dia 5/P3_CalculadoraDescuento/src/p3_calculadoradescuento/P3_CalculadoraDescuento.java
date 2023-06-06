
package p3_calculadoradescuento;


import java.util.Scanner;

public class P3_CalculadoraDescuento {
    /*Pídele al usuario que ingrese el precio original de un producto.
    Pídele al usuario que ingrese el porcentaje de descuento.
    Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
    Muestra el precio final al usuario.*/


    public static void main(String[] args) {
        double precioOriginal, descuento, precioConDescuento;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio");
        precioOriginal = leer.nextDouble();
        System.out.println("Ingrese el descuento(%)");
        descuento = leer.nextDouble();
        precioConDescuento = precioOriginal - (precioOriginal*descuento/100);
        System.out.println("El precio del producto con descuento es " +  precioConDescuento + "$");
    }
    
}
