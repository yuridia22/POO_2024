public class Lapiz {
    private String nombre;
    private double tamaño;
    private String color;
    private String material;
    private boolean estado;
    private String marca;
    private boolean escribir;

    public Lapiz(String nombre, double tamaño, String color, String material, boolean estado, String marca, boolean escribir) {
        this.setNombre(nombre);
        this.setTamaño(tamaño);
        this.setColor(color);
        this.setMaterial(material);
        this.setEstado(estado);
        this.setMarca(marca);
        this.setEscribir(escribir);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEscribir(boolean escribir) {
        this.escribir = escribir;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean getEstado() {
        return estado;
    }

    public String getMarca() {
        return marca;
    }

    public boolean getEscribir() {
        return escribir;
    }

    public void escribir() {
        if (!escribir) {
            escribir = true;
            System.out.println(" El "+nombre+" es de "+color+" y de "+material+" y tambien es de la marca "+marca+" y su peso es ligero");
        } else {
            escribir = false;
            System.out.println("El lápiz dejó de escribir");
        }
    }

}