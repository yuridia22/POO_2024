package DanaChin.Progrmas.Objeto1;

public class Lapiz {
    // Atributos
    private String color;
    private String marca;
    private double longitud;
    private boolean tieneGoma;

    // Constructor
    public Lapiz(String color, String marca, double longitud, boolean tieneGoma) {
        this.color = color;
        this.marca = marca;
        this.longitud = longitud;
        this.tieneGoma = tieneGoma;
    }

    // Métodos getter y setter para color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Métodos getter y setter para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Métodos getter y setter para longitud
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    // Métodos getter y setter para tieneGoma
    public boolean isTieneGoma() {
        return tieneGoma;
    }

    public void setTieneGoma(boolean tieneGoma) {
        this.tieneGoma = tieneGoma;
    }

    // Método para afilar el lápiz
    public void afilar() {
        // Supongamos que afilar reduce la longitud del lápiz en 0.5 unidades
        longitud -= 0.5;
    }

    // Método para usar la goma
    public void usarGoma() {
        if (tieneGoma) {
            System.out.println("La goma está siendo utilizada.");
        } else {
            System.out.println("Este lápiz no tiene goma.");
        }
    }

    // Método para describir el lápiz
    public void describir() {
        System.out.println("Lápiz de color " + color + ", marca " + marca + ", longitud " + longitud + " cm.");
        if (tieneGoma) {
            System.out.println("Tiene goma.");
        } else {
            System.out.println("No tiene goma.");
        }
    }
}