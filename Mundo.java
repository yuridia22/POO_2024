public class Mundo{
    //atributos//
    private String color;
    private String texto;
    private double size;
    //metodos//
    public Mundo(String color){
        this.color=color.equals("")?"Rojo":color;
        this.texto="HolaMundo";
        this.size=(this.size >= 1) ? this.size : 12;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color.equals("")?"Rojo":color;
    }
    public String getTexto(){
        return texto;
    }
     public void setTexto(String texto){
        this.texto=texto.equals("")?"Hola Mundo":texto;
     }
     public double getSize(){
        return size;
     }
     public void setSize(double size){
        this.size=(size >= 1) ? size : 12;
     }
}