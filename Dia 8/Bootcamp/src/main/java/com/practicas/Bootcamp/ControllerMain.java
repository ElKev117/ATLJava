package com.practicas.Bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class ControllerMain {
    /*Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
     */
    @GetMapping("/CalcularAreaDeCuadrado")
    public String calcularAreaDeCuadrado() {
        int area, lado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida de los lados del cuadrado");
        lado = leer.nextInt();
        area = lado * lado;
        return "El area del cuadrado de lado " + lado + " es " + area;
    }

    //Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
    @GetMapping("/CalcularAreaDeTriangulo")
    public String calcularAreaDeTriangulo() {
        int base, altura;
        float area;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida de la base del triangulo");
        base = leer.nextInt();
        System.out.println("Ingrese la medida de la altura del triangulo");
        altura = leer.nextInt();
        area = ((base * altura) / 2);
        return "El area del Triangulo de base " + base + " y altura " + altura + " es " + area;
    }

    //Crear una función que sea un generador de contraseñas.
    // Al llamarla debe devolver una contraseña (por ejemplo, puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
    @GetMapping("/generar-password")
    public String generarContrasena() {
        String caracteres = "";
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int x = 0; x < banco.length(); x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            caracteres += caracterAleatorio;
        }
        return caracteres;
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

}