public class Gato {
    private String nombre;
    private String color;
    private int edad;
    private float peso;
    private String raza;

    
    public Gato(String nombre, String color, int edad, float peso, String raza) {
        setNombre(nombre);
        setColor(color);
        setEdad(edad);
        setPeso(peso);
        setRaza(raza);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}