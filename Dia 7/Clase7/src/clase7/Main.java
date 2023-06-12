package clase7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número");
            numeros[i] = leer.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println();//Para impresion en la consola(Diseño)
            System.out.println(numeros[i]);
        }

        //Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

        int mayor, menor;
        mayor = menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println();
        System.out.println("El número mayor es: " + mayor + " y el menor es: " + menor);

        //Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
        float prom = 0;
        for (int i = 0; i < numeros.length; i++) {
            prom += numeros[i];
        }
        System.out.println("El promedio es: " + (prom / numeros.length));

    }
}