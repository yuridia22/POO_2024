public class Lapicero {
    private String color;
    private int porcientoTinta;
    private String marca;

    public Lapicero(String color, int porcientoTinta, String marca) {
        setColor(color);
        setPorcientoTinta(porcientoTinta);
        setMarca(marca);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setPorcientoTinta(int porcientoTinta) {
        this.porcientoTinta = porcientoTinta;
    }
    public int getPorcientoTinta() {
        return porcientoTinta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public String pintar(int porcientoTinta) {
        if(porcientoTinta>4) {
            return "el lapicero esta pintado de color "+getColor();
        } else {
            return "no hay suficiente tinta";
        }
    }

}
