
package pruebas;

import java.util.Random;

public class Termometro {
    private double temperaturaMinima;
    private double temperaturaMaxima;
    private double temperaturaActual;

    public Termometro(double temperaturaMinima, double temperaturaMaxima) {
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public void medirTemperatura() {
        Random random = new Random();
        temperaturaActual = temperaturaMinima + (temperaturaMaxima - temperaturaMinima) * random.nextDouble();
    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public static void main(String[] args) {
        Termometro termometro = new Termometro(0, 100);
        termometro.medirTemperatura();
        double temperatura = termometro.getTemperaturaActual();
        System.out.println("La temperatura actual es: " + temperatura);
    }
}
