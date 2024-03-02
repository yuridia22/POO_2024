public class HolaMundoOO {
    private String color;
    private String texto;
    private String idioma;

    public HolaMundoOO(String texto) {
        this.texto = texto;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    private String obtenerCodigoColor() {
        switch (color.toLowerCase()) {
            case "black": return "\u001B[30m";
            case "red": return "\u001B[31m";
            case "blue": return "\u001B[34m";
            case "green": return "\u001B[32m";
            default: return "\u001B[0m"; 
        }
    }
    public void imprimir() {
        String colorCode = obtenerCodigoColor();
        System.out.println(colorCode + "Hola Mundo: " + texto + ",\nColor: " + color + ", Idioma: " + idioma + "\u001B[0m");
    }
}

