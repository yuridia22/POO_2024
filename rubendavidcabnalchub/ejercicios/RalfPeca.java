public class RalfPeca {
    private String nombre;
    private int altura;
    private double peso;
    private int edad;
    private String color;
    private int fuerza;
    private Hacha hacha;
    private Zapatos zapatos;

    public RalfPeca(String nombre, int altura, double peso, int edad, String color, int fuerza) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.color = color;
        this.fuerza = fuerza;
        this.hacha = new Hacha(5, 30, "plateado", "acero");
        this.zapatos = new Zapatos(10, "amarillo", "cuero");
    }

    public void correr() {
        System.out.println(nombre + " está corriendo con zapatos de color " + zapatos.obtenerColor() +
                " que aumentan su velocidad a " + zapatos.obtenerVelocidad() + ".");
    }

    public void atacar() {
        System.out.println(nombre + " está atacando con su hacha.");
        hacha.golpear();
    }

    public void saltar() {
        System.out.println(nombre + " está saltando.");
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerAltura() {
        return altura;
    }

    public int obtenerFuerza() {
        return fuerza;
    }

class Hacha {
    private double peso;
    private int tamaño;
    private String color;
    private String material;

    public Hacha(double peso, int tamaño, String color, String material) {
        this.peso = peso;
        this.tamaño = tamaño;
        this.color = color;
        this.material = material;
    }

    public void golpear() {
        System.out.println("¡Golpe con el hacha!");
    }

    public double obtenerPeso() {
        return peso;
    }

    public int obtenerTamaño() {
        return tamaño;
    }

    public String obtenerMaterial() {
        return material;
    }
}

class Zapatos {
    private int talla;
    private String color;
    private String material;
    private int velocidad;

    public Zapatos(int talla, String color, String material) {
        this.talla = talla;
        this.color = color;
        this.material = material;
        this.velocidad = 10;
    }

    public int obtenerTalla() {
        return talla;
    }

    public String obtenerColor() {
        return color;
    }

    public String obtenerMaterial() {
        return material;
    }

    public int obtenerVelocidad() {
        return velocidad;
    }
}
}