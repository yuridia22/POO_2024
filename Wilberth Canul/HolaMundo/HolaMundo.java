public class HolaMundo {
    private String color;
    private String texto;
    private int tamañoLetra;

    public HolaMundo(String color, String texto, int size) {
        this.color = color != null ? color : "blanco"; 
        this.texto = texto != null ? texto : "¡Hola Mundo!"; 
        this.tamañoLetra = size > 0 ? size : 14; 
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
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

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getTamañoLetra() {
        return tamañoLetra;
    }

    public void setTamañoLetra(int tamañoLetra) {
        this.tamañoLetra = tamañoLetra > 0 ? tamañoLetra : 14;
    }
}