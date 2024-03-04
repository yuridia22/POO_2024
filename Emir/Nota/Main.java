package Nota;

public class Main {
    public static void main(String[] args) {
        Color c = new Color("azul");
        Nota n = new Nota("03/03/2024", "Realizar mi tarea de programación", "04/03/2024");
        System.out.print(c.getColorANSI() + n.toString());
    }
}
