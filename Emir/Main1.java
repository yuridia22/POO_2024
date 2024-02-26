public class Main1 {
     public static void main(String[] args) {
        Texto t1 = new Texto("rojo", "Hola Mundo R", 12.5);
        System.out.println(t1.escribir());
        t1.setColor("azul");
        System.out.println(t1.escribir());
        t1.setColor("verde");
        System.out.println(t1.escribir());
        t1.setColor("amarillo");
        System.out.println(t1.escribir());
        t1.setColor("morado");
        System.out.println(t1.escribir());
        t1.setColor("cian");
        System.out.println(t1.escribir());
        t1.setColor("negro");
     }
}
