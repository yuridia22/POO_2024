public class Pelota{
    private String tipo;
    private String color;
    private String forma;
    private String size;
    private double diametro;
    private String medida;
    // Constructor
    public Pelota(String tipo){
        this.tipo=tipo.equals("")?"Pelota de Ping Pong":tipo;
        this.color= "Blanco";
        this.forma= "Esferica";
        this.size="pequeña";
        this.diametro=40.0;
        this.medida=" mm ";
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo.equals("")?"Ping Pong":tipo;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color.equals("")?"Blanco":color;
    }
    public String getForma(){
        return forma;
    }
    public void setForma(String forma){
        this.forma=forma.equals("")?"Esferica":forma;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size=size.equals("")?"Pequeña":size;
    }
    public double getDiametro(){
        return diametro;
    }
    public void setDiametro(double diametro){
        this.diametro=(diametro<40.0)?40.0:diametro;
    }
    public String getMedida(){
        return medida;
    }
    public void setMedida(String medida){
        this.medida=medida.equals("")?" mm ":medida;
    }
    // Método para que la pelota rebote//
    public void rebotar() {
        System.out.println("La pelota está rebotando");
    }
    public void lanzar() {
        System.out.println("¡Lanzando la pelota!");
    }
    public void ensuciarse() {
        System.out.println("se ensucio la pelota");
    }
    public void romperse(String golpe) {
        System.out.println("se rompio la Pelota" + golpe);
    }
}