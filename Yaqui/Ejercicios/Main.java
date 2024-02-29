package Yaqui.Ejercicios;

import ManuelYah.Clima;

public class Main {
    public static void main(String[] arg) {
        Perro miperro = new Perro("Pedro");
        miperro.ladrar();
        System.out.println(miperro.getNombre());
        miperro.comer("la tarea Jeffrey");
        Clima miclima = new Clima("lg", "verde", 32, 27, 34, true);
        miclima.subirTemperatura(24);
        System.out.println(miclima.getTemperatura());
    }
}
