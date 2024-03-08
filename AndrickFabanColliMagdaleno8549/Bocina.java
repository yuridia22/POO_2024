public class Bocina {
    
    private String nombre;
    private String marca;
    private double altura;
    private double peso;
    
    
    public Bocina(String nombre, String marca, double altura, double peso) {
        this.nombre = nombre;
        this.marca = marca;
        this.altura = altura;
        this.peso = peso;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    public void encendido() {
        System.out.println("La bocina " + nombre + " está encendida.");
    }
    
    public void apagado() {
        System.out.println("La bocina " + nombre + " está apagada.");
    }
    
    public void reproducirMusica() {
        System.out.println("La bocina " + nombre + " está reproduciendo música.");
    }
    
    public void prenderLuzParpadeante() {
        System.out.println("La bocina " + nombre + " ha encendido una luz parpadeante.");
    }
}
