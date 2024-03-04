public class Lampara {
    private String marca;
    private String tipo;
    private boolean encendida;

    
    public Lampara(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
        this.encendida = false;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void encender() {
        this.encendida = true;
        System.out.println("Lámpara " + marca + " encendida.");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("Lámpara " + marca + " apagada.");
    }
}