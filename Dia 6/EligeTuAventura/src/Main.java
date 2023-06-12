import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: \n" +
                "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                "2) Sigues el sendero iluminado hacia una cabaña acogedora\n");
        opc = leer.nextInt();

        if (opc==1){
            System.out.println("Mientras ignoras la cabaña y sigues explorando llegas a un lago el cual sientes que te atrae de alguna forma, no puedes evitar seguir acercandote... \n" +
                    "pero cuando te das cuenta de que tú mismo no eres muy conciente de lo que haces de repente tratas de correr pero es demasiado tarde,\n una sombra te abraza y te impide seguir corriendo " +
                    "sietes como poco a poco te arrastra hacía el lago y tu resistencia es inutil,\n de repente tu visión se oscurece y no escuchas nada... te das cuenta que has sido tragado por el lago... \ntus ultimos momentos son extrañamente pacificos(FIN RUTA MALA)");
        } else if (opc==2) {

            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                    "1) Entras por la puerta de la izquierda \n" +
                    "2) Optas por la puerta de la derecha\n");

            opc = leer.nextInt();

            if (opc==1){
                System.out.println("Has elegido entrar por la puerta de la izquierda, sientes un hedor horrible, y tratas de volver atrás pero te das cuenta que la puerta tiene seguro,\n no te queda más opción que avanzar en ese oscuro pasillo " +
                        "cuando avanzas sientes un ruido fuerte pero no puedes ver nada por la oscuridad,\n sientes que algo se acerca más y más así que decides correr pero luego pasa lo inevitable, esa cosa te alcanza y terminó siendo una roca gigante en forma de esfera...\n" +
                        "cuando ya tu cuerpo está aplastado sabes que no hay forma de que te salves, como una burla del destino, notas que entra una pequeña luz de la luna por un pedazo de techo roto,\n lo cual ilumina un poco el suelo y te deja entreveer que" +
                        "no fuiste el único que sufrió el mismo destino,\n tal vez era este tu destino? y si hubieras tomado la otra puerta?, y si hubieras decidido no entrar a la cabaña en primer lugar? hubieras tenido otro destino?...(FIN RUTA MALA)");
            } else if (opc==2) {
                System.out.println("Al abrir la puerta de la derecha, te encuentras con una habitación llena de tesoros brillantes y mágicos.\n " +
                        "Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque.\n " +
                        "Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!(FIN RUTA BUENA)\n");

            }else {
                System.out.println("Lo siento, la opción que escogiste no es valida:(");
            }

        }else {
            System.out.println("Lo siento, la opción que escogiste no es valida:(");
        }
    }
}