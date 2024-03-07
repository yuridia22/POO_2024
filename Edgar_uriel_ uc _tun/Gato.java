    import java.util.Scanner;
    
    public class Gato {


    private String nombre;
    private int edad;
    private String color;
    private String raza;

    public Gato(String nombre, int edad, String color, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void maullar() {
        System.out.println(nombre + " está maullando. ¡Miau!");
    }

    public void caminar() {
        System.out.println(nombre + " está caminando.");
    }

    public void correr() {
        System.out.println(nombre + " está corriendo a toda velocidad.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gato miGato = new Gato("Pelusa", 3, "Blanco", "Persa");

        int opcion = 0;

        do {
            System.out.println("Elige una acción para " + miGato.getNombre() + ":");
            System.out.println("1. Maullar");
            System.out.println("2. Caminar");
            System.out.println("3. Correr");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    miGato.maullar();
                    break;
                case 2:
                    miGato.caminar();
                    break;
                case 3:
                    miGato.correr();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}