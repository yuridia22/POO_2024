public class Television {
    private String marca;
    private int tamPant;
    private int estado;
    private int canal;
    private int volumen;

    public Television(String marca, int tamPant, int estado){
        setMarca(marca);
        setTamP(tamPant);
        setEstado(estado);
        setCanal(1);
        setVolumen(22);
    }

    public Television(int tamPant, int estado){
        setMarca("Samsung");
        setTamP(tamPant);
        setEstado(estado);
        setCanal(1);
        setVolumen(22);
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public int getTamP(){
        return tamPant;
    }

    public void setTamP(int tp){
        this.tamPant = tp;
    }

    public int getEstado(){
        return estado;
    }

    public void setEstado(int e){
        this.estado = e;
    }

    public int getCanal(){
        return canal;
    }

    public void setCanal(int c){
        this.canal = c;
    }

    public int getVolumen(){
        return volumen;
    }

    public void setVolumen(int v){
        this.volumen = v;
    }

    public void datos(){
        System.out.println("Television marca " + marca + " con pantalla de " + tamPant + " pulgadas.");
        if (estado == 1) {
            System.out.println("Está en el canal " + canal + " y con un volumen de " + volumen);
        }
        System.out.println("Encienda la televisión para ver el canal y el volumen");
    }

    public void cambiarC(int cNuevo){
        if (estado == 1) {
            canal = canal + cNuevo;
            System.out.println("*Cambiando de canal*\nEl nuevo canal es el canal " + cNuevo);
        }
        else{
            System.out.println("La televisión está apagada, enciéndala para poder cambiar el canal");
        }
    }

    public void cambiarV(int vNuevo){
        if (estado == 1) {
            volumen = vNuevo;
            System.out.println("*Cambiando volumen*\nEl volumen de la television ahora es de " + vNuevo);
        }
        else{
            System.out.println("La televisión está apagada, enciéndala para poder cambiar el volumen");
        }
    }

    public static void main(String[] args) {
        Television t = new Television("TCL", 50, 1);
        t.datos();
        t.cambiarC(3);
        t.cambiarV(15);

        Television t1 = new Television(45, 0);
        t1.datos();
        t1.cambiarC(6);
        t1.cambiarV(2);
    }
}
