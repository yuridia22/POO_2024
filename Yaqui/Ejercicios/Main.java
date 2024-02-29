package Yaqui.Ejercicios;

import PRO.Progrmas.claseHerenica.Eva;
import JesusUicab.ejerciciosclase.Ventilador;

public class Main {
    public static void main(String[] arg) {
        Perro miperro = new Perro("Pedro");
        miperro.ladrar();
        System.out.println(miperro.getNombre());
        miperro.comer("la tarea Jeffrey");
        Ventilador miventi = new Ventilador("sharp", "negro");
        miventi.apagar();
    }

}
