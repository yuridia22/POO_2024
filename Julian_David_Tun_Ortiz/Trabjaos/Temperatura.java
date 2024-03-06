package Trabjaos;

public class Temperatura {
    private double valor;
    private char unidad;

    public Temperatura() {
        setValor(34.4);
        setUnidad('C');

    }

    public Temperatura(double valor, char unidad) {
        this.valor = valor;
        this.unidad = unidad;

    }

    public double getValor() {
        return valor;
    }

    public char getUnidad() {
        return unidad;

    }

    public void setValor(double valor) {
        this.valor = valor;

    }

    public void setUnidad(char unidad) {
        this.unidad = unidad;

    }

}
