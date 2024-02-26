public class Texto {
    private String color;
    private String texto;
    private double size;
    private String colorHex;

    public Texto(String color, String texto, double size){
        setColor(color);
        setTexto(texto);
        setSize(size);
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

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        switch (color) {
            case "azul" :
            this.color = color;
            setColorHex("\u001B[34m");
                break;
            case "verde" :
            this.color = color;
            setColorHex("\u001B[32m");
                break;
            case "rojo" :
                this.color = color;
                setColorHex("\u001B[31m");
                break;
            case "amarillo" :
                this.color = color;
                setColorHex("\u001B[33m");
                break;
            case "morado" :
                this.color = color;
                setColorHex("\u001B[35m");
                break;
            case "cian" :
                this.color = color;
                setColorHex("\u001B[36m");
                break;
            case "negro" :
                this.color = color;
                setColorHex("\u001B[30m");
            default: 
                this.color = color;
                setColorHex("\u001B[37m");
                break;
        }
    }

    public String getColorHex(){
        return colorHex;
    }

    public void setColorHex(String colorHex){
        this.colorHex = colorHex;
    }

    public String escribir(){
        return(getColorHex() + getTexto() + "\u001B[0m");
    }
}
