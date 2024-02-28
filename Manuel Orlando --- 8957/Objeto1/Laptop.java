package Objeto1;
public class Laptop {
    private String marca;
    private String color;
    private String sistemaOperativo;
    private String tamanio;
    private int almacenamiento;
    private int ram;
    private boolean io;

    public Laptop(String marca, String color, String sistemaOperativo, String tamanio, int almacenamiento, int ram) {
            setMarca(marca);
            setColor(color);
            setSistemaOperativo(sistemaOperativo);
            setTamanio(tamanio);
            setAlmacenamiento(almacenamiento);
            setRam(ram);
            setIo(false);;
    }

    // getters
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public boolean getIo() {
        return io;
    }

    // Setters
    public void setMarca(String m) {
        this.marca = m.equals("")?"Lenove":m;
    }

    public void setColor(String c) {
        this.color = c.equals("")?"Negro":c;
    }

    public void setSistemaOperativo(String s) {
        this.sistemaOperativo = s.equals("")?"Windows": s;
    }

    public void setTamanio(String t) {
        this.tamanio = t.equals("")?"14 pulgadas por 8 pulgadas":t;
    }

    public void setAlmacenamiento(int i) {
        this.almacenamiento = i<=125?500:i;
    }

    public void setRam(int r) {
        this.ram = r<=4?8:r;
    }

    public void setIo(boolean o) {
        this.io = o;
    }
    //metodos
    public void suspender() {
        if (io) {
            System.out.println("Poniendo la laptop en suspensión...");
            io = false;
        } else {
            System.out.println("La laptop ya está apagada.");
        }
    }

    public void ejecutarPrograma(String programa) {
        if (io) {
            System.out.println("Ejecutando " + programa + " en la laptop...");
        } else {
            System.out.println("La laptop está apagada. Enciéndela antes de ejecutar programas");
        }
    }

    public void sobrecalentarse() {
        System.out.println("¡Cuidado! La laptop se está sobrecalentando. Apaga la laptop para evitar problemas");
    }

    public void aumentarRAM(int cantidadRAM) {
        if (io) {
            System.out.println("No se puede aumentar la RAM mientras la laptop está encendida");
        } else {
            System.out.println("Aumentando la RAM en " + cantidadRAM + "GB...");
        }
    }

    public void cambiarSistemaOperativo(String nuevoSO) {
        if (io) {
            System.out.println(
                    "No se puede cambiar el sistema operativo mientras la laptop está encendida");
        } else {
            System.out.println("Cambiando el sistema operativo a " + nuevoSO + "...");
            this.sistemaOperativo = nuevoSO;
        }
    }

    public void actualizar() {
        if (io) {
            System.out.println("Se esta actualizando");
        } else {
            System.out.println("No se puede actualizar por que esta apagado");
        }
    }

    public void mostrarInfo() {
        if(io){
            System.out.println("Marca: " + marca);
            System.out.println("Color: " + color);
            System.out.println("Sistema Operativo: " + sistemaOperativo);
            System.out.println("Tamaño: " + tamanio);
            System.out.println("Almacenamiento: " + almacenamiento);
            System.out.println("RAM: " + ram);
            System.out.println("Estado: " + (io ? "Encendida" : "Apagada"));
        }else{
            System.out.println("La laptop esta apagada");
        }
    }
}
