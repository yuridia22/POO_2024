package Practica2;

public class Refrigerador {
    private double ancho;
    private double largo;
    private double alto;
    private String color;
    private String marca;
    private int estado;

    public Refrigerador(double ancho, double largo, double alto, String color, String marca){
        setAncho(ancho);
        setLargo(largo);
        setAlto(alto);
        setColor(color);
        setMarca(marca);
        setEst(1);
    }

    public double getAncho(){
        return ancho;
    }

    public void setAncho(double a){
        this.ancho = a;
    }

    public double getLargo(){
        return largo;
    }

    public void setLargo(double l){
        this.largo = l;
    }

    public double getAlto(){
        return alto;
    }

    public void setAlto(double al){
        this.alto = al;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public int getEst(){
        return estado;
    }

    public void setEst(int e){
        this.estado = e;
    }

    public void abrirCerrar(){
        if (estado==1) {
            System.out.println("El refirgerador está abierto");
        }
        else{
            System.out.println("El refrigerador está cerrado");
        }
    }

    public void datos(){
        System.out.println("Dimesiones:\nAncho: " + ancho + "\nLargo: " + largo + "\nAlto: " + alto + "\nColor: " + color + "\nMarca: " + marca);
    }

    public static void main(String[] args) {
        Refrigerador r = new Refrigerador(0.7, 0.5, 1.7, "gris", "Mabe");
        r.datos();
        r.abrirCerrar();
        r.setEst(0);
        r.abrirCerrar();
    }
}
