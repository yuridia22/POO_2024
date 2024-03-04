public class Espada {
    private String material;
    private int damange;
    private int endurance;
    private String name;

    public Espada(String material, int damange, int endurance, String name) {
        setMaterial(material);
        setDamange(damange);
        setEndurance(endurance);
        setName(name);
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setDamange(int damange) {
        if(damange > 0 && damange <=100) {
            this.damange = damange;
        }
    }
    public int getDamange() {
        return damange;
    }

    public void setEndurance(int endurance) {
        if(endurance > 0 && endurance <=100) {
            this.endurance = endurance;
        }
    }
    public int getEndurance() {
        return endurance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String toDamange(int damange) {
        return "-"+damange;
    }
}
