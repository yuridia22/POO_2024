public class Celular {
    private String marca;
    private String modelo;
    private int bateria;
    private int estado;
    
    public Celular(String marca, String modelo, int bateria) {
        setMarca(marca);
        setModelo(modelo);
        setBateria(bateria);
        setEstado(0);
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
    
    public int getBateria() {
        return bateria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("El porcentaje de batería debe estar entre 0 y 100.");
        }
    }

    public void enceder(){
        estado = 1;
        System.out.println("El celular se encendió");
    }

    public void apagar(){
        estado = 0;
        System.out.println("El celular está apagado");
    }
    
    public void cargarBateria(int porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.bateria += porcentaje;
            if (this.bateria > 100) {
                this.bateria = 100;
            }
            System.out.println("La batería ha sido cargada al " + this.bateria + "%.");
        } else {
            System.out.println("El porcentaje de carga debe estar entre 1 y 100.");
        }
    }
    
    public void usarCelular(int minutos) {
        if (estado == 1) {
            if (minutos > 0 && minutos <= 120) {
                if (this.bateria >= minutos / 2) {
                    this.bateria -= minutos / 2;
                    System.out.println("Se ha usado el celular durante " + minutos + " minutos. La batería restante es " + this.bateria + "%.");
                } else {
                    System.out.println("La batería es insuficiente para usar el celular durante " + minutos + " minutos.");
                }
            } else {
                System.out.println("El tiempo de uso debe estar entre 1 y 120 minutos.");
            }
        }
        else{
            System.out.println("El celular está apagado");
        }
    }
    
    public void mostrarInformacion() {
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nBatería: " + getBateria() + "%");
    }
}
