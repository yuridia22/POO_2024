public class Viaje {
    private String destino;
    private int duracion;
    private String medioT;
    private int costoBoleto;
    private int costoHotel;
    private int costoT;
    private String fechaInicio;
    private String fechaFin;

    public Viaje(String destino, int costoBoleto, int costoHotel, String fechaInicio, String fechaFin){
        setDestino(destino);
        setDuracion(4);
        setMedioT("Avión");
        setCostoB(costoBoleto);
        setCostoH(costoHotel);
        setFechaI(fechaInicio);
        setFechaF(fechaFin);
    }

    public Viaje(String destino, int costoBoleto, int costoHotel){
        setDestino(destino);
        setDuracion(2);
        setMedioT("Autobús");
        setCostoB(costoBoleto);
        setCostoH(costoHotel);
        setFechaI("12 de marzo de 2020");
        setFechaF("12 de mayo de 2020");
    }

    public String getDestino(){
        return destino;
    }

    public void setDestino(String d){
        this.destino = d;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setDuracion(int du){
        this.duracion = du;
    }

    public String getMedioT(){
        return medioT;
    }

    public void setMedioT(String mt){
        this.medioT = mt;
    }

    public int getCostoB(){
        return costoBoleto;
    }

    public void setCostoB(int cb){
        this.costoBoleto = cb;
    }

    public int getCostoH(){
        return costoHotel;
    }


    public void setCostoH(int ch){
        this.costoHotel = ch;
    }
    
    public int getCostoT(){
        return costoT;
    }

    public void setCostoT(int ct){
        this.costoT = ct;
    }

    public String getFechaI(){
        return fechaInicio;
    }

    public void setFechaI(String fi){
        this.fechaInicio = fi;
    }

    public String getFechaF(){
        return fechaFin;
    }

    public void setFechaF(String ff){
        this.fechaFin = ff;
    }

    public void obtenerInfo(){
        System.out.println("El viaje tiene como destino " + destino + " el cual empezará el "+ fechaInicio + " y terminará el " + fechaFin + " con una duración de " + duracion + " meses. Este se hará en " + medioT + " y tendrá un costo de " + costoBoleto + " por boleto y de " + costoHotel + " por un mes en el hotel.");
    }

    public void calcularCostoT(){
        costoT = costoBoleto*2 + costoHotel*(duracion);
        System.out.println("El costo total del viaje será de " + costoT + " pesos");
    }

    public static void main(String[] args) {
        Viaje v = new Viaje("Marruecos", 2750, 1800, "11 de enero de 2021", "11 de mayo de 2021");
        v.obtenerInfo();
        v.calcularCostoT();
        Viaje v1 = new Viaje("Chiapas", 570, 1200);
        v1.obtenerInfo();
        v1.calcularCostoT();
    }
}
