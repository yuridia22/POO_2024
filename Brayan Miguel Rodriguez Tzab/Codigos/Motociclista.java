public class Motociclista {
    private String nombre;
    private String pais;
    private int edad;
    private double altura;
    private double peso;
    private String genero;
    private String experiencia;

    public Motociclista(String nombre, String pais, int edad, double altura, double peso, 
    String genero, String experiencia){
    
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
     }

     public String getPais() {
        return nombre;
    }

    public void setPais(String nombre) {
        this.nombre = pais;
    }
    public int getEdad() {
            return edad;
    }
    
    public void setEdad(int edad) {
            this.edad = edad;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double a){
        this.altura = altura;
    }
    public double getpeso(){
        return altura;
    }

    public void setPeso(double a){
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String nombre) {
        this.genero = genero;
     }
     public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String nombre) {
         this.experiencia = experiencia;
     }


     public void manejar(String accion) {
        System.out.println(" Has avanzado ");
    }

    public void acelerar() {
        System.out.println("Haz acelerado");
    }

    public void frenar() {
        System.out.println (" Haz frenado");
    }

    }
