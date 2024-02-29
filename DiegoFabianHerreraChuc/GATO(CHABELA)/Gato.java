//Codigo Diagrama clase Gato
public class Gato {
    private String nombre;
    private int edad;
    private String color;
    private String raza;

    // Constructor
    public Gato(String nombre, int edad, String color, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.raza = raza;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Método main para probar la clase Gato
    public static void main(String[] args) {

        Gato miGato = new Gato("Chabela", 1, "Gris", "Malix");

        System.out.println("Nombre: " + miGato.getNombre());
        System.out.println("Edad: " + miGato.getEdad() + "Anio");
        System.out.println("Color: " + miGato.getColor());
        System.out.println("Raza: " + miGato.getRaza());

    }
}