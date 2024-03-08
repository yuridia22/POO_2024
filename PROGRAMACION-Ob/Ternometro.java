public class Termometro {
    private double temperatura;
    private double temperaturaMinima;
    private double temperaturaMaxima;
    private int unidades;
    private double[] rango;

   
    public Termometro(double temperatura, double temperaturaMinima, double temperaturaMaxima, int unidades, double[] rango) {
        this.temperatura = temperatura;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.unidades = unidades;
        this.rango = rango;
    }

    
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double[] getRango() {
        return rango;
    }

    public void setRango(double[] rango) {
        this.rango = rango;
    }

    
    public void leerTemperatura() {
        System.out.println("La temperatura actual es: " + temperatura + " " + (unidades == 0 ? "Celsius" : "Fahrenheit"));
    }

    public void establecerTemperatura(double temperatura) {
        this.temperatura = temperatura;
        System.out.println("Temperatura establecida a: " + temperatura + " " + (unidades == 0 ? "Celsius" : "Fahrenheit"));
    }

    public void cambiarUnidades(int unidades) {
        this.unidades = unidades;
        System.out.println("Unidades cambiadas a: " + (unidades == 0 ? "Celsius" : "Fahrenheit"));
    }

    public void establecerRango(double[] rango) {
        this.rango = rango;
        System.out.println("Rango establecido a: " + java.util.Arrays.toString(rango));
    }
}