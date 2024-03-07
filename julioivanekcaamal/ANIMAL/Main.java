package julioivanekcaamal.ANIMAL;
import animal.Perro;


/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       Perro p = new Perro("chapa", "doberman", "negro", "macho", 2, 34);
       System.out.println(p.getNombre());
    }
}