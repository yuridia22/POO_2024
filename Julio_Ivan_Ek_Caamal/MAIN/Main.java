package MAIN;

import Julio_Ivan_Ek_Caamal.ANIMAL.Perro;
import Julio_Ivan_Ek_Caamal.TERMOMETRO_DIGITAL.TermometroDigital;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Perro p = new Perro("chapa", 2, "doberman");
        System.out.print(p.getNombre());      
    }
}