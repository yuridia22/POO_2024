

public class Arquero {
    private String nombre;
    private int edad;
    private double altura;
    private String genero;

    public Arquero(String nombre, int edad, double altura, String genero){
        setNombre(nombre);
        setEdad(edad);
        setAltura(altura);
        setGenero(genero);
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

    public double getAltura(){
        return altura;
    }

    public void setAltura(double a){
        this.altura = a;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String g){
        this.genero = g;
    }

    public void caminar(){
        System.out.println("Estoy caminando");
    }

    public void disparar(int felchas){
        System.out.println("He disparado " + felchas + " flechas");
    }

    public void correr(){
        System.out.println("Estoy corriendo");
    }

    public void datos(){
        System.out.println("Arquero:\nNombre: " + nombre + "\nEdad: " + edad + "\nGenero: " + genero);
    }
}
