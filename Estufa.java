public class Estufa {
    private String marca;
    private String color;
    private int anchoCm;
    private int alturaCm;
    private boolean encendido;

    //constructor :v

    public Estufa (String marca, String color, int anchoCm,int alturaCm, boolean encendido){
        this.marca = marca.equals("")?"Mabe": marca;
        this.color = color.equals("")?"Gris": color;
        this.anchoCm = anchoCm;
        this.alturaCm = alturaCm;
        this.encendido = encendido;
    }

    //sets

    public void setMarca(String marca) {
        this.marca = marca.equals("")?"Mabe": marca;
    }

    public void setColor(String color) {
        this.color = color.equals("")?"Gris": color;
    }

    public void setAnchoCm(int anchoCm) {
        this.anchoCm = anchoCm;
    }

     public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    //gets

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getAnchoCm() {
        return anchoCm;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public boolean isEncendido() {
        return encendido;
    }

    //metodos

    public void encender() {
    if (!encendido) {encendido = true;} else {}
}
    
    public void apagar() {
    if (encendido) {encendido = false;} else {}
}

    public String bajarFlama(){
        if(isEncendido() == true){
           return " La flama se ajusto a baja";
        } 
        else{
            return " La estufa debe estar encendida para hacer eso";
        }
    }

    public String subirFlama(){
        if(isEncendido() == true){
           return " La flama se ajusto a alta";
        } 
        else{
            return " La estufa debe estar encendida para hacer eso";
        }
    }

    public String mostrar(){
        return "Marca: " + getMarca() + "  Color: " + getColor() + "  Ancho(Cm): " + getAnchoCm() + 
      "  Alto(Cm): " + getAlturaCm() + "  Estado(Encendido,Apagado) " + isEncendido();
    }

}