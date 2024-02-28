public class Main{
    public static void main (String[] args){
        Perro miperro = new Perro("Pedro","salchicha",3.5, 1.5, 5.7);
        System.out.println(miperro.getNombre());
        System.out.println(miperro.getRaza());
        System.out.println(miperro.getEdad() + " años");
        System.out.println(miperro.getAltura() + " m");
        System.out.println(miperro.getPeso() + " kg");
        miperro.ladrar();
        miperro.oir("comer");
        
    }
}