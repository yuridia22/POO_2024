public class Telefono {

    private int carga;
    private String color;
    private String marca;
    private double tamaño;
    private int almacenamiento;
    private boolean encendido;

    public Telefono(int carga, String color, String marca, double tamaño, int almacenamiento, boolean encendido) {
        this.setCarga(carga);
        this.setColor(color);
        this.setMarca(marca);
        this.setTamaño(tamaño);
        this.setAlmacenamiento(almacenamiento);
        this.setEncendido(encendido);
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getCarga() {
        return carga;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("el "+ marca  + " de color " + color + " tiene " + carga + " % de carga " + "mide " + tamaño + " pulgadas ha sido encendido");
        } else {
            System.out.println("el "+ marca  + " de color " + color + " tiene " + carga + " % de carga " + "mide " + tamaño + " pulgadas ya esta encendido");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("el "+ marca  + " de color " + color + " tiene " + carga + " % de carga " + "mide " + tamaño + " pulgadas ya ha sido apagado");
        } else {
            System.out.println("el "+ marca  + " de color " + color + " tiene " + carga + " % de carga " + "mide " + tamaño + " pulgadas esta apagado");
        }
    }

}
