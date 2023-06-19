import java.time.LocalDate;

public class Persona {
    private String id, nombre, dni;
    LocalDate fecha;
    private int edad;

    public Persona(){
    }

    public Persona(String id, String nombre, String dni, LocalDate fecha, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.edad = edad;
    }

    public String mostrar(){
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fecha=" + fecha +
                ", edad=" + edad +
                '}';
    }

    public boolean esMayorDeEdad(){
        boolean esMayor= false;
        if(edad>18){
            esMayor= true;
        }
        return esMayor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
