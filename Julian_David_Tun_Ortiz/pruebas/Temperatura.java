package pruebas;

public class Temperatura {
    private double valor;
    private char unidad;

    public Temperatura() {
        setValor(0);
        setUnidad('C');
    }

    public Temperatura(double valor, char unidad) {
        this.valor = 0;
        this.unidad = 'C';
    }

    public double getValor() {
        return this.valor;
    }

    public char getUnidad() {
        return this.unidad;
    }

    public void setValor(double valor) {
        this.valor = (valor > 0 ? valor : 0);
    }

    public void setUnidad(char unidad) {
        this.unidad = ((unidad == 'C') ? 'C' : unidad);
    }

    public String toString() {
        return "Temperatura: " + getValor() + " grados " + getUnidad();
    }
}