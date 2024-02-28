public class Computadora {
    private String marca;
    private String modelo;
    private int memoriaRAM; // gigabytes
    private double almacenamiento; //in terabytes
    private boolean encendida;
    public Computadora(String marca, String modelo, int memoriaRAM, double almacenamiento) {
        setMarca(marca);
        setModelo(modelo);
        setMemoriaRAM(memoriaRAM);
        setAlmacenamiento(almacenamiento);
        this.encendida = false; 
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = (marca != null && !marca.isEmpty()) ? marca : "Desconocida";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = (modelo != null && !modelo.isEmpty()) ? modelo : "Desconocido";
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = (memoriaRAM > 0) ? memoriaRAM : 4; // Default to 4 GB if non-positive value provided
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = (almacenamiento > 0) ? almacenamiento : 256.0; // Default to 256 GB if non-positive value provided
    }

    public boolean isEncendida() {
        return encendida;
    }
    public void encender() {
        if (!encendida) {
            System.out.println("La computadora se ha encendido.");
            encendida = true;
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }
    public void apagar() {
        if (encendida) {
            System.out.println("La computadora se ha apagado.");
            encendida = false;
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }
    public void procesarDatos(String datos) {
        if (encendida) {
            System.out.println("Procesando datos: " + datos);
        } else {
            System.out.println("La computadora está apagada. Enciéndela para procesar datos.");
        }
    }
}

//clase main
public class MainComputadora {
    public static void main(String[] args) {
        // Create a computer
        Computadora miComputadora = new Computadora("HP", "Pavilion", 8, 512.0);

        // Display initial computer details
        System.out.println("Marca: " + miComputadora.getMarca());
        System.out.println("Modelo: " + miComputadora.getModelo());
        System.out.println("Memoria RAM: " + miComputadora.getMemoriaRAM() + " GB");
        System.out.println("Almacenamiento: " + miComputadora.getAlmacenamiento() + " GB");

        // Turn on the computer
        miComputadora.encender();

        // Process data
        miComputadora.procesarDatos("Datos importantes");

        // Try to process data when the computer is turned off
        miComputadora.apagar();
        miComputadora.procesarDatos("Datos después de apagar");

        // Turn on the computer again
        miComputadora.encender();

        // Process data after turning the computer back on
        miComputadora.procesarDatos("Datos después de encender");

        // Display final computer details
        System.out.println("La computadora está encendida: " + miComputadora.isEncendida());
    }
}
