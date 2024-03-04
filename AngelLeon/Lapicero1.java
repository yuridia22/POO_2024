
public class Lapicero1 {
    private String marca;
    private String color;
    private String tamaño;
    private int tinta;

    public Lapicero1(String marca, String color, String tamaño) {
        this.marca = marca;
        this.color = color;
        this.tamaño = tamaño;
        this.tinta = 100;  // Inicializamos la tinta al 100%
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getTinta() {
        return tinta;
    }

    public String escribir(int cantidadPalabras) {
        if (tinta >= cantidadPalabras) {
            tinta -= cantidadPalabras;
            return "Se han escrito " + cantidadPalabras + " palabras. Nivel de tinta restante: " + tinta + "%.";
        } else {
            return "No hay suficiente tinta para escribir.";
        }
    }

    public boolean sinTinta() {
        return tinta <= 0;
    }

    public static void main(String[] args) {
        Lapicero1 miLapicero = new Lapicero1("BIC", "Azul", "Mediano");
        System.out.println("Marca: " + miLapicero.getMarca());
        System.out.println("Color: " + miLapicero.getColor());
        System.out.println("Tamaño: " + miLapicero.getTamaño());

        miLapicero.setMarca("Faber-Castell");
        System.out.println("Nueva Marca: " + miLapicero.getMarca());

        System.out.println(miLapicero.escribir(30));
        System.out.println(miLapicero.sinTinta());
    }
}