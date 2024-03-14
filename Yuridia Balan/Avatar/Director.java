public class Director {
    private String nombre;
    private int edad;
    private String titulo;
    private int añosExperiencia;
    
    public Director(String nombre, int edad, String titulo, int añosExperiencia) {
        setNombre(nombre);
        setEdad(edad);
        setTitulo(titulo);
        setAñosExperiencia(añosExperiencia);
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
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    public void imprimirInformacion() {
        System.out.println("Nombre del director: " + getNombre() + "\nEdad: " + getEdad() + " años" + "\nTítulo: " + titulo + "\nAños de experiencia: " + añosExperiencia);
    }
    
    public void gestionarPersonal() {
        System.out.println("El director está gestionando el personal de la escuela.");
    }
    
    public void tomarDecisiones() {
        System.out.println("El director está tomando decisiones importantes para la escuela.");
    }
}