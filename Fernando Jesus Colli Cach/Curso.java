package Curso;

public class Curso {
    private String nombre;
    private int codigo;

    public Curso(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public static void main(String[] args) {
        Curso miCurso = new Curso("Probabilidad y Estadística", 105);
        System.out.println("Nombre: " + miCurso.obtenerNombre());
        System.out.println("Código: " + miCurso.obtenerCodigo());
    }
}
