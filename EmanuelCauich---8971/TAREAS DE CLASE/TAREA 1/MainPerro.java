import PERRO1.Perro1;

public class MainPerro {
    public static void main(String[] args) {
        Perro1 dog = new Perro1("pepe", "", 1, 12.2, 2);

        System.out.println(dog.getNombre());
        System.out.println(dog.getAltura() + "metros");
    }   
}
