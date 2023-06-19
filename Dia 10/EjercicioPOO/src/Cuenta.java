/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y cantidad (puede tener decimales). Construye los siguientes métodos para la clase:
Un constructor, donde los datos pueden estar vacíos.
Los setters y getters para cada uno de los atributos. El atributo no se puede modificar directamente, sólo ingresando o retirando dinero.
mostrar(): Muestra los datos de la cuenta.
ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.*/
public class Cuenta {
    Persona titular;
    float cantidad;

    public Cuenta() {

    }

    public Cuenta(Persona titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Persona getTitular() {
        return titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public String mostrar() {
        return "Cuenta{" +
                "titular=" + titular.getNombre() +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cant) {
        if (cant >= 0) {
            this.cantidad += cant;
        }
    }

    public void retirar(double cant) {
        if (cant >= 0) {
            this.cantidad -= cant;
        }
    }


}
