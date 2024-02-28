public class HolaMundo {
    private String color;
    private String texto;
    private int tamaño;
    public HolaMundo(String c, String t, int s) {
        setColor(c);
        setTexto(t);
        setTamaño(s);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c.equals("")? "rojo":c;
        switch (c.toLowerCase()) {
            case "rojo":
                this.color = "\u001B[31m";
                break;

            case "verde":
                this.color = "\u001B[32m";
                break;

            case "amarillo":
                this.color = "\u001B[33m";
                break;

            case "azul":
                this.color = "\u001B[34m";
                break;

            case "magenta":
                this.color = "\u001B[35m";
                break;

            case "cyan":
                this.color = "\u001B[36m";
                break;

            case "blanco":
                this.color = "\u001B[37m";
                break;

            case "gris":
                this.color = "\u001B[90m";
                break;

            case "negro":
                this.color = "\u001B[30m";
                break;

            case "rosa":
                this.color = "\u001B[95m";
                break;

            case "naranja":
                this.color = "\u001B[38;5;208m";
                break;

            case "turquesa":
                this.color = "\u001B[38;5;45m";
                break;

            case "violeta":
                this.color = "\u001B[38;5;165m";
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
        this.texto = t.equals(" ")? "Hola Mundo Color": t;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int s) {
        this.tamaño = s < 0 ? 14:s;
    }

    public void imprimir() {
        System.out.println("\033[38;5;" + color + "" + texto + " " + getColor() + "\033[0m");
        System.out.println("Con tamaño de letra " + tamaño);
    }
}
