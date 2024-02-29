public class HolaMundoOO {
    private String texto;
    private String color;


    public HolaMundoOO(String texto){
        setTexto(texto);
        setColor("Rojo");
    }

    public void setTexto(String texto){
        this.texto = (texto.equals(" "))?"Hola Mundo OO": texto;
    }

    public void setColor(String color){
        switch (color = color.toLowerCase()) {
            case "black": this.color = "\033[30m"; break;
            case "red": this.color = "\033[31m"; break;
            case "blue": this.color = "\033[34m"; break;
            case "green": this.color = "\033[32m"; break;
            default:this.color = "\u001B[0m"; break;
        }
    }

    public String getTexto(){
        return texto;
    }

    public String getColor(){
        return color;
    }

    public String mostrarTexto(){
        return (getColor()+getTexto());
    }

    
}
