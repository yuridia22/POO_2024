package Trabjaos;

public class Practica2 {
    double moneda;
    double dolar = 0.059;
    double valorDolar;

    public Practica2(double moneda) {
        this.moneda = moneda;
    }

    public void conversor() {
        valorDolar = moneda * dolar;
        System.out.println("El valor de la moneda: " + moneda + " es igual a: " + valorDolar + " Dolares");
    }

    public static void main(String[] args) {
        Practica2 p = new Practica2(22.0);
        p.conversor();

    }
}
