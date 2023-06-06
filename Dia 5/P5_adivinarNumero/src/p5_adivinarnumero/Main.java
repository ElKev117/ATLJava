package p5_adivinarnumero;

import java.util.Scanner;

public class Main {
    //Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int alea, numUsuario;
        alea = (int) (Math.random()*100);

        numUsuario = leer.nextInt();
        if (numUsuario == alea){
            System.out.println("Has acertado");
        }else{
            System.out.println("Has fallado el número era " + alea);
        }

    }
}
