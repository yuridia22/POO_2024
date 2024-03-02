//Codigo Diagrama clase Espartano
public class Espartano {
    private String nombre;
    private int edad;
    private int fuerza;
    private int armadura;
    private int salud;
    private int resistencia;
    private int velocidad;

    public Espartano(String nombre, int edad, int fuerza, int armadura, int salud, int resistencia, int velocidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.salud = salud;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
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

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Método main para probar la clase Espartano
    public static void main(String[] args) {
        
        Espartano Leonidas = new Espartano("Leonidas", 40, 100, 80, 100, 90, 70);

        // Imprimir información del Espartano
        System.out.println("Nombre: " + Leonidas.getNombre());
        System.out.println("Edad: " + Leonidas.getEdad());
        System.out.println("Fuerza: " + Leonidas.getFuerza());
        System.out.println("Armadura: " + Leonidas.getArmadura());
        System.out.println("Salud: " + Leonidas.getSalud());
        System.out.println("Resistencia: " + Leonidas.getResistencia());
        System.out.println("Velocidad: " + Leonidas.getVelocidad());
        
        /*// Modificar la fuerza del Espartano
        leonidas.setFuerza(110);
        System.out.println("Nueva fuerza: " + leonidas.getFuerza()); */
        
    }
}