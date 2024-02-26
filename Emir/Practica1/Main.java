package Practica1;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("4 de noviembre de 2020");
        Lector le1 = new Lector("Juan", 987);
        Libro l1 = new Libro("Quimica", "Choppín, Gregory R.", 87);
        Bibliotecario b1 = new Bibliotecario("Rosa", 06);
        System.out.println(p1.getFecha());
        le1.datos();
        le1.solicitar();
        l1.datos();
        b1.datos();
        b1.validarSolicitud();
        le1.regresar();
        b1.negarEntrega();
    }
}
