public class Armor {
    private String name;
    private int defensa;
    private String material;

    public Armor(String name, int defensa, String material) {
        setName(name);
        setDefensa(defensa);
        setMaterial(material);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public int getDefensa() {
        return defensa;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public int protejer(int defensa) {
        return defensa;
    }
}
