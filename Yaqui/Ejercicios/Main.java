package Yaqui.Ejercicios;

import PRO.Progrmas.claseHerenica.Eva;

public class Main {
    public static void main(String[] arg) {
        Perro miperro = new Perro("Pedro");
        miperro.ladrar();
        System.out.println(miperro.getNombre());
        miperro.comer("la tarea Jeffrey");
        Eva e = new Eva("Japón", "RJ4560", "morado", 2, 3);
        System.out.println("pais " + e.getPaisDelEva() + "modelo" + e.getModelo());

    }

}
