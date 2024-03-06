package Trabjaos;

public class Color {
    private String nombreColor;
    private String colorAnsi;

    public Color(String color) {
        setColorAnsi(color);
        getColorAnsi();

    }

    public String getColor() {
        return nombreColor;

    }

    public void setColorAnsi(String nombre) {

        switch (nombre) {
            case "negro":
                this.nombreColor = "Negro";
                colorAnsi = "\033[30m";
                break;
            case "rojo":
                this.nombreColor = "Rojo";
                colorAnsi = "\033[31m";
                break;
            case "verde":
                this.nombreColor = "Verde";
                colorAnsi = "\033[32m";
                break;
            case "amarillo":
                this.nombreColor = "Amarillo";
                colorAnsi = "\033[33m";
                break;
            case "azul":
                this.nombreColor = "azul";
                colorAnsi = "\033[34m";
                break;
            case "magenta":
                this.nombreColor = "Magenta";
                colorAnsi = "\033[35m";
                break;
            case "cyan":
                this.nombreColor = "Cyan";
                colorAnsi = "\033[36m";
                break;
            default:
                this.nombreColor = "blanco";
                colorAnsi = "\033[37m";
                break;
        }
    }

    public String getColorAnsi() {
        return colorAnsi;
    }

    public String reset() {
        colorAnsi = "\033[37m";
        return colorAnsi;
    }

}
