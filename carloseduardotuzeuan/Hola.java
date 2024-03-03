public class Hola {
    private String color;
    private String idioma;
    private String texto;
    private int tamañoTexto;

    // Constructor
    public Hola(String texto, String color, int tamañoTexto) {
        setTexto(texto);
        setColor(color);
        setTamañoTexto(tamañoTexto);
        setIdioma("ingles");
    }

    // Métodos de acceso
    public void setColor(String color) {
        switch (color) {
            case "azul":this.color = "\033[34m";break;
            case "rojo":this.color = "\033[31m"; break;
            case "verde":this.color = "\033[32m";break;
            case "amarillo":this.color = "\033[33m";break;
            default:
                this.color = "\033[0m";break;
        }
    }

    public String getColor() {
        return color;
    }

    public void setTexto(String texto) {
        this.texto = texto.equals("") ? "Holaaaaaaaaa" : texto;
    }
    public String getTexto() {
        return texto;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
        if (idioma.equals("ingles")) {
            setTexto("Hello World");
        } else if (idioma.equals("español")) {
            setTexto("Hola Mundo");
        }
    }
    public String getIdioma() {
        return idioma;
    }
    public void setTamañoTexto(int tamañoTexto) {
        this.tamañoTexto = tamañoTexto;
    }
    public int getTamañoTexto() {
        return tamañoTexto;
    }
    // Método de accion
    public void imprimirTexto() {
        System.out.println("\033[0;" + tamañoTexto + "m" + color + texto + "\033[0m");
    }
}
