public class HolaMundoColor {
    private String color;
    private String texto;
    private int tamañoLetra;

    public HolaMundoColor(String color, String texto, int size) {
        setColor(color);
        setTamañoLetra(size);
        setTexto(texto);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
            case "azul":
                this.color = "\u001B[34m"; // Código ANSI para azul
                break;
            case "amarillo":
                this.color = "\u001B[33m"; // Código ANSI para amarillo
                break;
            case "rojo":
                this.color = "\u001B[31m"; // Código ANSI para rojo
                break;
            default:
                this.color = "\u001B[30m"; // Código ANSI para negro (por defecto)
                break;
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getTamañoLetra() {
        return tamañoLetra;
    }

    public void setTamañoLetra(int tamañoLetra) {
        this.tamañoLetra = tamañoLetra > 0 ? tamañoLetra : 14; //Define de que sea la letra mayor a 0.
    }

    public void imprimir() {
        System.out.println("\033[38;5;" + color + "m" + texto + "\033[0m" + " con tamaño de letra " + tamañoLetra);
    }
}
