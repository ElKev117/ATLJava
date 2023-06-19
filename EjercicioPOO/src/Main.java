import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Vamos a crear una clase llamada Persona. Sus atributos son: id, nombre, edad, fecha de nacimiento y DNI. Construye los siguientes métodos para la clase:
        //Un constructor, donde los datos pueden estar vacíos.
        //Los setters y getters para cada uno de los atributos.
        //mostrar(): Muestra los datos de la persona.
        //esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
        String id, nombre, dni;
        int edad;

        LocalDate fecha = LocalDate.now();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su ID");
        id = leer.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese su DNI");
        dni = leer.nextLine();
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();

        Persona persona = new Persona(id,nombre,dni, fecha,edad);
        System.out.println(persona.mostrar());
        if (persona.esMayorDeEdad()){
            System.out.println("La persona es mayor");
        }else{
            System.out.println("La persona es menor");
        }


    }
}