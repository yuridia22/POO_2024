package Trabjaos;

/*
Negro  = \033[30m
rojo = \033[31m
verde = \033[32m
amarillo = \033[33m
azul = \033[34m
magenta = \033[35m
blanco =  \033[37m
cyan = \033[36m
reset = u001B[0m

*/

public class HolaMundoColor {
    private String texto;
    private String color;
    private String colorANSI;

    public HolaMundoColor(String texto, String color) {
        // this.color = color;
        // this.texto = texto;
        setTexto(texto);
        setColor(color);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto.equals("") ? "Hola Mundo!!" : texto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        switch (color) {
            case "negro":
                this.colorANSI = "\033[30m";
                break;
            case "rojo":
                this.colorANSI = "\033[31m";
                break;
            case "verde":
                this.colorANSI = "\033[32m";
                break;
            case "amarillo":
                this.colorANSI = "\033[33m";
                break;
            case "azul":
                this.colorANSI = "\033[34m";
                break;
            case "magenta":
                this.colorANSI = "\033[35m";
                break;
            case "cyan":
                this.colorANSI = "\033[36m";
                break;
            /*
             * case "reset":
             * this.colorANSI = "u001B[0m";
             * break;
             */
            default:
                this.color = "blanco";
                this.colorANSI = "\033[37m";
                break;
        }

    }

    public String getColorANSI() {
        return colorANSI;
    }

    public void reset() {
        this.colorANSI = "\033[37m";
    }

    public void show() {
        System.out.println(getColorANSI() + texto);
    }
}
