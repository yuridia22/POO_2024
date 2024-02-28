public class HolaMundo {
    private String color;
    private String texto;
    private int tamañoLetra;
    public HolaMundo(String c, String t, int s) {
        this.color = c.equals(" ")? "rojo":c;
        this.texto = t.equals(" ")? "Hola Mundo Color": t;
        this.tamañoLetra = s < 0 ? 14:s;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        switch (c.toLowerCase()) {
            case "azul":
                this.color = "\u001B[34m";
                break;
            case "amarillo":
                this.color = "\u001B[33m";
                break;
            case "rojo":
                this.color = "\u001B[31m";
                break;
            default:
                this.color = "\u001B[30m";
                break;
        }
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String t) {
        this.texto = texto;
    }

    public int getTamañoLetra() {
        return tamañoLetra;
    }

    public void setTamañoLetra(int s) {
        this.tamañoLetra = s;
    }

    public void imprimir() {
        System.out.println("\033[38;5;" + color + "m" + texto + "\033[0m" + " con tamaño de letra " + tamañoLetra);
    }

    public static void main(String[] args) {
        HolaMundo h = new HolaMundo(" ", " ", -5);
        h.setColor("amarillo");
        h.imprimir();
    }
}
