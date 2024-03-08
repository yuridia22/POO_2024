public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private double peso;
    private double altura;

    
    public Perro(String nombre, String raza, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

   
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public void comer() {
        System.out.println("El perro está comiendo.");
    }

    public void dormir() {
        System.out.println("El perro está durmiendo.");
    }

    public void correr() {
        System.out.println("El perro está corriendo.");
    }

    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}