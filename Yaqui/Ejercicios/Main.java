package Yaqui.Ejercicios;

public class Main {
    public static void main(String[] arg) {
        Perro miperro = new Perro("Pedro");
        miperro.ladrar();
        System.out.println(miperro.getNombre());
        miperro.comer("la tarea Jeffrey");

    }
}
