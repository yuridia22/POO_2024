public class Texto {
    private Color c;
    private String texto;
    private double size;

    public Texto(String texto, double size){
        setTexto(texto);
        setSize(size);
        c = new Color("azul");
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto.equals(" ")?"Hola Mundo :)":texto;  
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size>=1?size:12;
    }

    public Color getColor(){
        return c;
    }

    public void setColor(String color){
        this.c.setColor(color);
    }

    public String escribir(){
        return(c.getColorANSI() + getTexto() + "\u001B[0m");
    }
}
