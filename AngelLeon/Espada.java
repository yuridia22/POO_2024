public class Espada {
    private String material;
    private String nombre;
    private int danioAtaque;
    private int danioDefensa;

    // Constructor
    public Espada(String material, String nombre, int danioAtaque, int danioDefensa) {
        setMaterial(material);
        setNombre(nombre);
        setDanioAtaque(danioAtaque);
        setDanioDefensa(danioDefensa);
    }

    // Sets
    public void setMaterial(String material) {
        this.material = (material != null && !material.trim().isEmpty()) ? material : "Acero";
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.trim().isEmpty()) ? nombre : "Espada";
    }

    public void setDanioAtaque(int danioAtaque) {
        this.danioAtaque = (danioAtaque >= 0) ? danioAtaque : 0;
    }

    public void setDanioDefensa(int danioDefensa) {
        this.danioDefensa = (danioDefensa >= 0) ? danioDefensa : 0;
    }

    // Gets
    public String getMaterial() {
        return material;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanioAtaque() {
        return danioAtaque;
    }

    public int getDanioDefensa() {
        return danioDefensa;
    }

    // Métodos
    public String atacar() {
        return "¡" + nombre + " ataca con " + danioAtaque + " de daño!";
    }

    public String defender() {
        return "¡" + nombre + " defiende con " + danioDefensa + " de defensa!";
    }
}
