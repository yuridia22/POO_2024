public class Refrigerador {
    private String marca;
    private String modelo;
    private double capacidad;
    private double temperatura;
    private String estado;

    
    public Refrigerador(String marca, String modelo, double capacidad, double temperatura) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.temperatura = temperatura;
        this.estado = "apagado";
    }

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void encender() {
        this.estado = "encendido";
        System.out.println("El refrigerador se ha encendido.");
    }

    public void apagar() {
        this.estado = "apagado";
        System.out.println("El refrigerador se ha apagado.");
    }

    public void cambiarCapacidad(double capacidad) {
        this.capacidad = capacidad;
        System.out.println("La capacidad del refrigerador ha sido cambiada a: " + capacidad + " litros.");
    }

    public void cambiarTemperatura(double temperatura) {
        this.temperatura = temperatura;
        System.out.println("La temperatura del refrigerador ha sido cambiada a: " + temperatura + " grados Celsius.");
    }
}
