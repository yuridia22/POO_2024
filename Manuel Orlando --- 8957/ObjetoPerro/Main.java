package ObjetoPerro;

public class Main{
    
    public static void main (String[] args){
        Perro miperro = new Perro("");
        System.out.print(miperro.getNombre());
        miperro.setNombre("Tobi");
        System.out.println();
        System.out.print(miperro.getNombre());
        System.out.println();
        miperro.ladrar();
        miperro.oir("saltar");
        miperro.morir();
    }
}