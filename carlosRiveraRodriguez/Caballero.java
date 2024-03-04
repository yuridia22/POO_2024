public class Caballero {
    private String name;
    private int defense;
    private int vida;

    public Caballero(String name,int defense, int vida, int attack) {
        setName(name);
        setDefense(defense);
        setVida(vida);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDefense(int defense) {
        if(defense > 0 && defense <=100) {
            this.defense = defense;
        }
    }
    public int getDefense() {
        return defense;
    }

    public void setVida(int vida) {
        if(vida > 0 && vida <=100) {
            this.vida = vida;
        }
    }
    public int getVida() {
        return vida;
    }

    public String atacar(Espada espada) {
        return espada.toDamange(espada.getDamange());

    }

    public int fend(Armor armor,int defense) {
        int total = defense + armor.protejer(armor.getDefensa());
        return total;
    }
}