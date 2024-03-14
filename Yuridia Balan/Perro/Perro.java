public class Perro {
    private String nombre;
    private String color;
    private double peso;
    private double edad;
    private String estado;

    public Perro(String nombre, String color, double peso, double edad, String estado) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.edad = edad;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void dormir() {
        System.out.println(nombre + " zzzzzzz fuiiissgsgss.");
    }

    public void respirar() {
        System.out.println(nombre + " respirando.");
    }

    public void olfatear() {
        System.out.println(nombre + " olfatea mmmmmssmsmsmmsmsmssss.");
    }

    public void comer() {
        System.out.println(nombre + " mmmmm skksjsjs deli carne.");
    }

    public void morder() {
        System.out.println(nombre + " mordio porque le iban a quitar su comida");
    }

    public void maullar() {
        System.out.println(nombre + " lo lastimaron Mmmmuaaaaaaahhhhuuaaa.");
    }

    public void morir() {
        this.estado = "muerto";
        System.out.println(nombre + " murio.");
    }

    public static void main(String[] args) {
        Perro miperro = new Perro("julia", "cafe", 3.0, 24.0, "vivo");
        miperro.dormir();
        miperro.respirar();
        miperro.olfatear();
        miperro.comer();
        miperro.morder();
        miperro.maullar();
        miperro.morir();
    }
}