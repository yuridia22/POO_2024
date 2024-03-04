package Objeto1;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("volar sobre de ti", "wil", 2007, "japones", true);
        libro.prestarLibro();
        libro.devolverLibro();
        libro.mostrarInformacion();
    }
}
