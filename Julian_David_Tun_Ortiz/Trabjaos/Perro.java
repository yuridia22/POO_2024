package Trabjaos;

public class Perro {
    private String nombre;
    private String raza;
    private String color;
    private String genero;
    private int tamanio;
    private int edadMeses;
    private int peso;
    String comida;
    String sonido;

    public Perro(String nombre, String raza, String color, String genero, int tamanio, int edadMeses, int peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.genero = genero;
        this.tamanio = tamanio;
        this.edadMeses = edadMeses;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getEdadMeses() {
        return edadMeses;
    }

    public void setEdadMeses(int edadMeses) {
        this.edadMeses = edadMeses;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void ladrar() {
        System.out.println("guau guau guau");

    }

    public void comer(String comida) {
        this.comida = comida;
        System.out.println("MM que rica " + comida);

    }

    public void dormir() {
        System.out.println("Zzz ZZZ Zzzz ZZZ * " + nombre + " esta durmiendo *");
    }

    public void oir(String sonido) {
        this.sonido = sonido;
        switch (sonido) {
            case "ladra":
                ladrar();

                break;
            case "duerme":
                dormir();
                break;
            case "come":
                comer("anvorguesa");
                break;

            default:
                break;
        }
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro("Gordo", "Chihuahua", "cafe", "macho", 29, 8, 4);
        miPerro.comer("Sapote");
        miPerro.ladrar();
        miPerro.dormir();
        miPerro.setNombre("Juanini");
        miPerro.dormir();
        miPerro.oir("come");

    }
}
