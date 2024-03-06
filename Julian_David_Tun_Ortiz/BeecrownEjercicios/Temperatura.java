package BeecrownEjercicios;

public class Temperatura {
    private double valor;
    private char unidad;

    public Temperatura() {
        setValor(35.5);
        setUnidad('C');

    }

    public Temperatura(double valor, char unidad) {
        setUnidad(unidad);
        setValor(valor);

    }

    public void setUnidad(char unidad) {
        this.unidad = unidad;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getUnidad() {
        return unidad;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return " " + valor + " " + unidad;
    }

}