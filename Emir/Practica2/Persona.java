package Practica2;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
    }

    public void finalize(){
        System.out.println("Destruyendo la clase Persona para " + nombre);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int e){
        this.edad = e;
    }

    public void crecer(){
        System.out.println(nombre + " está creciendo.");
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }

    public static void main(String[] args) {
        Persona p = new Persona("Juan", 8);
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        p.crecer();
    }
}
