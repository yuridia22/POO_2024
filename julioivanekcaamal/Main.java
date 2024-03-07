package julioivanekcaamal;


import julioivanekcaamal.ANIMAL.Perro;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       julioivanekcaamal.ANIMAL.Perro p = new Perro("chapa", "doberman", "negro", "macho", 2, 34.56);
       System.out.println(p.getNombre()); 
    }
}