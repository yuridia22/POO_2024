package Trabjaos;

public class Mochila {
    private String color;
    private String tamanio;
    private String material;
    private int compartimientos;
    private int cierres;
    private boolean impermeable;
    private int precio;
    String objeto;

    public Mochila(String color, String tamanio, String material, int compartimientos, int cierres, boolean impermeable,
            int precio) {
        this.color = color;
        this.tamanio = tamanio;
        this.material = material;
        this.compartimientos = compartimientos;
        this.cierres = cierres;
        this.impermeable = impermeable;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCompartimientos() {
        return compartimientos;
    }

    public void setCompartimientos(int compartimientos) {
        this.compartimientos = compartimientos;
    }

    public int getCierres() {
        return cierres;
    }

    public void setCierres(int cierres) {
        this.cierres = cierres;
    }

    public boolean isImpermeable() {
        return impermeable;
    }

    public void setImpermeable(boolean impermeable) {
        this.impermeable = impermeable;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // metodos normales

    public void abrir() {
        System.out.println("Se abrio la mochila");

    }

    public void cerrar() {
        System.out.println("Se cerro la mochila");

    }

    public void agregarAlgo(String objeto) {
        this.objeto = objeto;
        System.out.println("Acabas de agregar " + objeto + " a la mochila");

    }

    public String quitarAlgo(String objeto) {
        this.objeto = objeto;
        System.out.println("sacaste el " + objeto + " de la mochila");
        return objeto;

    }

    public void vaciar() {
        System.out.println("vaciaste la mochila ahora no hay nada");

    }

    public static void main(String[] args) {
        Mochila miMochila = new Mochila("gris", "grande", "tela gruesa", 4, 5, false, 350);
        miMochila.abrir();
        miMochila.agregarAlgo("libreta");
        miMochila.setColor("verde");
        System.out.println("la mochila es color: " + miMochila.getColor());
        miMochila.quitarAlgo("libreta");
        miMochila.vaciar();

    }
}
