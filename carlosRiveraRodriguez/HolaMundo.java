public class HolaMundo {
    private String texto;
    private String color;

    public HolaMundo(String texto, String color) {
        setTexto(texto);
        setColor(color);
    }

    public void setTexto(String texto) {
        this.texto = texto.equals("")? "Hello World": texto;
    }
    public String getTexto() {
        return texto;
    }

    public void setColor(String color) {
        switch (color = color.toLowerCase()) {
            case "negro":
                this.color = "\033[30m";
                break;
            case "azul":
                this.color = "\033[34m";
                break;
            case "amarillo":
                this.color = "\033[33m";
                break;
            case "rojo":
                this.color = "\033[31m";
                break;
            case "verde":
                this.color = "\033[32m";
            default:
                this.color = "\u001B[0m";
                break;
        }
    }
    public String getColor() {
        return color;
    }

    public void cambiarMain() {
        this.texto = this.texto.toLowerCase();
    }
    public void cambiarMayus() {
        this.texto = this.texto.toUpperCase();
    }

    public String mostrar() {
        return getColor()+getTexto();
    }


}
