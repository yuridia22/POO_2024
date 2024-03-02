package Profesor;

public class Profesor {
    private String nombre;
    private int edad;
    private String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
    }

    public void darClase() {
    }

    public static void main(String[] args) {
        Profesor miProfesor = new Profesor("Juan", 35, "Matemáticas");
        System.out.println("Nombre: " + miProfesor.nombre);
        System.out.println("Edad: " + miProfesor.edad);
        System.out.println("Especialidad: " + miProfesor.especialidad);
    }
}
