public class Carro {
    private String marca;
    private String color;
    private String modelo;
    private int estado;
    private int anio;

    public Carro(String marca, String modelo, String color, int anio){
        setModelo(modelo);
        setColor(color);
        setMarca(marca);
        setAnio(anio);
        setEstado(0);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEstado() {
        return estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void enceder(){
        estado = 1;
        System.out.println("Carro encendido");
    }

    public void apagar(){
        estado = 0;
        System.out.println("Carro apagado");
    }

    public void acelerar(){
        if (estado == 1) {
            System.out.println("Acelerando");
        }
        else{
            System.out.println("Carro apagado");
        }
    }

    public void frenar(){
        if (estado == 1) {
            System.out.println("Frenando");
        }
        else{
             System.out.println("Carro apagado");
        }
    }
}
