public class Clima {
    private String marca;
    private String color;
    private int anchoCm;
    private int alturaCm;
    private int temperatura;
    private boolean encendido;

    //constructor :v

    public Clima (String marca, String color, int anchoCm,int alturaCm, int temperatura, boolean encendido){
        this.marca = marca.equals("")?"Prime": marca;
        this.color = color.equals("")?"Blanco": color;
        this.anchoCm = anchoCm;
        this.alturaCm = alturaCm;
        this.temperatura = temperatura;
        this.encendido = encendido;
    }

    //sets

    public void setMarca(String marca) {
        this.marca = marca.equals("")?"Prime": marca;
    }

    public void setColor(String color) {
        this.color = color.equals("")?"Blanco": color;
    }

    public void setAnchoCm(int anchoCm) {
        this.anchoCm = anchoCm;
    }

     public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
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

    public int getTemperatura() {
        return temperatura;
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

     public void subirTemperatura(int cantidad) {this.temperatura += cantidad;}

    public String modoAhorro(){
        if(isEncendido() == true){
           return " Modo ahorro de energia activado";
        } 
        else{
            return " El clima esta apagado no se puede activar este modo";
        }
    }

    public String modoCalefaccion(){
        if(isEncendido() == true){
           return " Modo calefacción activado";
        } 
        else{
            return " El clima esta apagado no se puede activar este modo";
        }
    }

    public String modoEnfriar(){
        if(isEncendido() == true){
           return " Modo Enfriar activado";
        } 
        else{
            return " El clima esta apagado no se puede activar este modo";
        }
    }

    public String mostrar(){
        return "Marca: " + getMarca() + "  Color: " + getColor() + "  Ancho(Cm): " + getAnchoCm() + 
      "  Alto(Cm): " + getAlturaCm() + "  Temperatura: " + getTemperatura() +   "  Estado(Encendido,Apagado) " + isEncendido();
    }

}