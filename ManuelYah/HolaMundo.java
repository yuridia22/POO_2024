public class HolaMundo{

    private String texto;
    private String color;

//constructor :v

    public HolaMundo(String texto, String color) {
        this.texto = texto.equals("")?"Hola Mundo":texto;
        this.color = color;
    }

//metodos de acceso
    public void setTexto(String texto){
        this.texto=texto.equals("")?"Hola Mundo":texto;
    }

    public String getTexto(){
        return texto;
    }
    
    public void setColor(String color){
        switch (color = color.toLowerCase()) {
            case "negro":this.color="\033[30m";break;
            case "rojo":this.color="\033[31m"; break;
            case "verde":this.color="\033[32m";break;          
            case "amarillo":this.color="\033[33m";break;
            case "azul":this.color="\033[34m"; break;
            case "blanco":this.color="\033[37m";break;
            default: this.color="\u001B[0m";break;
        }
    }

    public String getColor(){
        return color;
    }

//metodos de accion
    public void Mayusculas(){
        this.texto=this.texto.toUpperCase();
    }
    public void Minusculas(){
        this.texto = this.texto.toLowerCase();
    }
    public String mostrar(){
        return getColor()+getTexto()+"\u001B[0m";
    }
}