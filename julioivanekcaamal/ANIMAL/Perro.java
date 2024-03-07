package julioivanekcaamal.ANIMAL;

public class Perro {
    //////////////////////////////// atributos/////////////////////
    private String nombre;
    private String raza;
    private String color;
    private String genero;
    private int edad;
    private double peso;

    ////////////////////////////constructor////////////////////////////////////
    public Perro(String nombre,String raza, String color, String genero, int edad, double peso){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;             
    }

    /////////////////////////////metodos de acceso/////////////////////
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    /////////////////////////////////metodos de clase////////////////////////////////
    public void comer(){
        System.out.println("llomi llomi que rica comida");
    }
    public void correr(){
        System.out.println("corriendo..............");
    }
    public void ladrar(){
        System.out.println("grrrggrgrgrgrgrgrg  gou gou gau");
    }
    public void jugar(){
        System.out.println("jugando....................");
    }

    /////////////////////////////////main////////////////////////////// 
   

}