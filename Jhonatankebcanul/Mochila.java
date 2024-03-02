public class Mochila {
    private String material;
    private int capacidad;
    private int cierres;

    public Mochila() {
        material = "cuero";        
        capacidad = 15;
        cierres = 4;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCierres(int cierres) {
        this.cierres = cierres;
    }

    public String getMaterial() {
        return material;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public int getCierres() {
        return cierres;
    }

    public void agregarObjeto() {
        if (capacidad < 15) {
            System.out.println("*Agrega un objeto*");
            capacidad++;
        } else {
            System.out.println("*mochila llena*");
        }
    }

    public void sacarObjeto() {
        if (capacidad > 0) {
            System.out.println("*Saque un objeto*");
            capacidad--;
        } else {
            System.out.println("*Mochila vacía*");
        }
    }

    public void abrir() {
        if (cierres < 4) {
            System.out.println("*Abrir*");
            cierres++;
        } else {
            System.out.println("*Cierres abiertos*");
        }
    }

}

