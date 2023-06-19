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

        //LocalDate fecha = LocalDate.now();


        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento (yyyy-mm-dd)");
        LocalDate fecha = LocalDate.parse(leer.nextLine());
        System.out.println("Ingrese su ID");
        id = leer.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese su DNI");
        dni = leer.nextLine();
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();

        Persona persona = new Persona(id, nombre, dni, fecha, edad);
        System.out.println(persona.mostrar());
        if (persona.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }

        System.out.println("Ingrese la cantidad de dinero que tendrá en su cuenta");
        float cant = leer.nextFloat();
        Cuenta cuenta = new Cuenta(persona, cant);

        System.out.println("Ingrese la cantidad de dinero que desea depositar");
        float depos = leer.nextFloat();
        cuenta.ingresar(depos);

        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        float retirar = leer.nextFloat();
        cuenta.retirar(retirar);

        System.out.println(cuenta.mostrar());

    }
}