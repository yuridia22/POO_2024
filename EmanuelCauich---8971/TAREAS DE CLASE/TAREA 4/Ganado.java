public class Ganado {
    private String raza;
    private int edad; // en meses
    private double peso; // en kilogramos
    private String color;

    public Ganado(String raza, int edad, double peso, String color) {
        setRaza(raza);
        setEdad(edad);
        setPeso(peso);
        setColor(color);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void productividad() {
        System.out.println("Este ganado está siendo productivo.");
    }

    public void temperamento(String estadoDeAnimo) {
        System.out.println("El temperamento del ganado es " + estadoDeAnimo);
    }

    public void jalar() {
        System.out.println("El ganado está jalando algo.");
    }

    public void correr() {
        System.out.println("El ganado está corriendo.");
    }
}
