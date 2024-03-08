public class Perro {
    
    private String nombre;
    private int edad;
    private double peso;
    
    
    public Perro(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }
    
    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }
    
    public String jugar(String pelota) {
        return nombre + " está jugando con la pelota " + pelota;
    }
    
    public void crecer() {
        edad++;
    }
    
    public void morir() {
        System.out.println(nombre + " ha fallecido. Descansa en paz, amigo.");
    }
    
    public void moverCola() {
        System.out.println(nombre + " está moviendo la cola.");
    }
    
    public void oir(String sonido) {
        System.out.println(nombre + " escuchó: " + sonido);
    }
    
    public void changeEstado(int estado) {
        
    }
}
