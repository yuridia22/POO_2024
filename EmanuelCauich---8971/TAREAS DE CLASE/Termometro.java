import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Termometro {

    private String marca;
    private double temperaturaActual;
    private String escala;
    private List<Double> temperaturasAlmacenadas;
    private boolean estadoTermometro;

    public Termometro(String marca, String escala) {
        setMarca(marca);;
        setEscala(escala);;
        setTemperaturaActual(0.0);
        this.temperaturasAlmacenadas = new ArrayList<>();
        setEstadoTermometro(false);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = (marca.equals("")) ? "Sin Marca" : marca;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = (escala.equals("")) ? "Celsius" : escala;
    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public boolean getEstadoTermometro() {
        return estadoTermometro;
    }

    public void setEstadoTermometro(boolean io) {
         estadoTermometro = io;
    }

    public void medirTemperatura() {
        Random random = new Random();
        temperaturaActual = random.nextDouble() * 100.0; // Rango de temperaturas arbitrario
        System.out.println("Temperatura medida: " + temperaturaActual + " Grados celcius");
    }
//Aqui comienza el metodo sobrecargado
    public void medirTemperatura(String unidad) {
            Random random = new Random();
            temperaturaActual = random.nextDouble() * 100.0; // Rango de temperaturas arbitrario
            System.out.println("Temperatura medida: " + temperaturaActual + " " + unidad);
    }
//Aqui termina el metodo sobrecargado

    public void almacenarTemperatura() {
        temperaturasAlmacenadas.add(temperaturaActual);
        System.out.println("Temperatura almacenada correctamente.");
    }

    public void identificarTemperaturas() {
        System.out.println("Identificando temperaturas...");
    }

    public double promediarTemperaturas() {
        if (temperaturasAlmacenadas.isEmpty()) {
            System.out.println("No hay temperaturas almacenadas para calcular el promedio.");
            return 0.0;
        } else {
            double suma = 0.0;
            for (double temp : temperaturasAlmacenadas) {
                suma += temp;
            }
            return suma / temperaturasAlmacenadas.size();
        }
    }

    public void convertirAEscala() {
        double fahrenheit = (temperaturaActual*(9/5))+32;
        double kelvin = temperaturaActual+273.15;
        double celcius = temperaturaActual;
        System.out.println("Convertido a fahrenheit es = " + fahrenheit);
        System.out.println("Convertido a kelvin es = " + kelvin);
        System.out.println("Convertido a Celcuis es = " + celcius);
    }
}
