public class Main{
    
    public static void main (String[] args){
        Perro p = new Perro();
        System.out.print(p.getNombre());
        p.setNombre("");
        System.out.print(p.getNombre());
        p.ladrar();
        p.oir("comer");
        
    }
}