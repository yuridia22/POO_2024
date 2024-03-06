package Trabjaos;

import java.util.Random;

public class TermometroDigital {
    // Atributos

    private String marca;
    private Temperatura temperatura;
    private boolean encendido;
    private Color color;
    private Temperatura max;
    private Temperatura min;

    // Constructor

    public TermometroDigital(String color) {
        // setTemperatura(34, 'C');
        setEncendido(false);
        setColor(color);

    }

    // metodos de acceso Get

    public String getMarca() {
        return marca;
    }

    /*
     * public Temperatura getTemperatura() {
     * medirTemperatura();
     * return temperatura;
     * }
     */

    public boolean getEncendido() {

        return encendido;
    }

    public Color getColor() {
        return color;
    }

    public Temperatura getMax() {
        return max;
    }

    public Temperatura getMin() {
        return min;
    }

    // Metodos de acceso Set

    public void setMarca(String marca) {
        this.marca = (marca.equals("")) ? "Samsung" : marca;

    }


     public void setTemperatura(double valor, char unidad) {
     temperatura = new Temperatura(valor, unidad);
     
      }
     

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;

    }

    public void setColor(String c) {
        this.color = new Color(c);

    }

    public void setMax(double valor, char unidad) {
        max = new Temperatura(valor, unidad);

    }

    public void setMin(double valor, char unidad) {
        min = new Temperatura(valor, unidad);

    }

    // Metodos de termometro

    public void medirTemperatura() {
        Random random = new Random();
        if (getEncendido() == false) {
            System.out.println("No  puedes medir la temperatura con el termometro apagado");
            return;
        } else {
            double temperatura;
            temperatura = min.getValor() + (max.getValor() - min.getValor()) * random.nextDouble();
            System.out.println(color.getColorAnsi() + "La tempratura es: "+temperatura + " "+color.reset());
        }

    }

    public void encender() {
        setEncendido(true);
        System.out.println("has encendido el termometro");
    }

    public void apagar() {
        setEncendido(false);
        System.out.println("termometro apagado");
    }

    public void convertir() {

    }

    public void show() {
        medirTemperatura();

    }

}
