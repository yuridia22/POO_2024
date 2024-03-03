public class Gato {
    private String nombre;
    private String color;
    private int edadMeses;
    private boolean vivo;

    // Constructor

    public Gato(String nombre, String color, int edadMeses, boolean vivo) {
        this.nombre = (nombre != null && !nombre.isEmpty()) ? nombre : "Cokie";
        this.color = (color != null && !color.isEmpty()) ? color : "Naranja";
        this.edadMeses = (edadMeses >= 0) ? edadMeses : 0;
        this.vivo = vivo;
    }

    // Sets

    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.isEmpty()) ? nombre : "Cokie";
    }

    public void setColor(String color) {
        this.color = (color != null && !color.isEmpty()) ? color : "Naranja";
    }

    public void setEdadMeses(int edadMeses) {
        this.edadMeses = (edadMeses >= 0) ? edadMeses : 0;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    // Gets

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getEdadMeses() {
        return edadMeses;
    }

    public boolean isVivo() {
        return vivo;
    }

    // Métodos

    public void morir() {
        vivo = false;
    }

    public void crecerEdad(int cantidad) {
        edadMeses += cantidad;
    }

    public String maullar() {
        return (isVivo()) ? nombre + ": MIAU MIAU" : nombre + " está muerto, no puede maullar";
    }

    public String comer() {
        return (isVivo()) ? nombre + ": Está comiendo ñom ñom" : nombre + " está muerto, no puede comer";
    }

    public String dormir() {
        return (isVivo()) ? nombre + ": Está durmiendo" : nombre + " está muerto, ya lleva durmiendo desde hace días y no despierta";
    }

    public String limpiarse() {
        return (isVivo()) ? nombre + ": Se está limpiando su pelo" : nombre + " no puede limpiarse solo, está muerto";
    }

    public String saltar() {
        return (isVivo()) ? nombre + ": Da un salto y se sube en algo" : nombre + " está muerto, no puede saltar";
    }

    public String mostrar() {
        return "Nombre: " + nombre + ", Color: " + color + ", Edad en meses: " + edadMeses + " meses, Estado: " + ((isVivo()) ? "vivo" : "muerto");
    }
}

