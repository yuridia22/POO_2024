public class Main{
    
    public static void main (String[] args){
        Perro miperro = new Perro("Pedro");
        System.out.print(miperro.getNombre());
        miperro.setNombre("");
        System.out.print(miperro.getNombre());
        miperro.ladrar();
        miperro.oir("comer");
        
    }
}