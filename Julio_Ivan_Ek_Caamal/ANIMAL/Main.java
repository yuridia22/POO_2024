package ANIMAL;


/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       Perro p = new ANIMAL.Perro("chapa", "doberman", "negro", "macho", 2, 34);
       System.out.println(p.getNombre());
    }
}