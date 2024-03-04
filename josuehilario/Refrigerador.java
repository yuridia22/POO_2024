public class Refrigerador {
    private String marca;
    private int capacidadLitros;
    private int temperaturaActual;

    
    public Refrigerador(String marca, int capacidadLitros) {
        this.marca = marca;
        this.capacidadLitros = capacidadLitros;
        this.temperaturaActual = 4;
    }

    // Métodos set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public void setTemperaturaActual(int temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public void ajustarTemperatura(int nuevaTemperatura) {
        this.temperaturaActual = nuevaTemperatura;
        System.out.println("Temperatura del refrigerador " + marca + " ajustada a " + nuevaTemperatura + "°C.");
    }
}
