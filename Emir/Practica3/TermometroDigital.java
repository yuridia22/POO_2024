public class TermometroDigital {
    private double temperatura;
    private String unidad;
    private String color;
    private String marca;
    private int estado;
    private int rangoMax;
    private int rangoMin;

    public TermometroDigital(String unidad, int rangoMax, int rangoMin){
        setUnidad(unidad);
        setColor("gris");
        setMarca("Samsung");
        setRangoMax(rangoMax);
        setRangoMin(rangoMin);
        setEstado(0);
    }
    
    public TermometroDigital(String unidad, int estado, String marca, int rangoMax, int rangoMin) {
        setUnidad(unidad);
        setColor("gris");
        setMarca(marca);
        setRangoMax(rangoMax);
        setRangoMin(rangoMin);
        setEstado(estado);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double t) {
        this.temperatura = t;
    }


    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String u) {
        this.unidad = u;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public int getRangoMax() {
        return rangoMax;
    }

    public void setRangoMax(int rma) {
        this.rangoMax = rma;
    }

    public int getRangoMin() {
        return rangoMin;
    }

    public void setRangoMin(int rmi) {
        this.rangoMin = rmi;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int e) {
        this.estado = e;
    }

    public void medirTemp(){
        if (estado == 1) {
            temperatura = (int)(Math.random() * (rangoMax-rangoMin) + rangoMin);
            switch (unidad) {
                case "celsius":
                    this.temperatura = temperatura*1;
                    break;
                case "farenheit":
                    this.temperatura = 1.8*temperatura + 32;
                    break;
                case "kelvin":
                    this.temperatura = temperatura + 273;
                    break;
                default:
                    break;
            }
            System.out.println("La temperatura es " + temperatura + " grados " + unidad);
        }
        else{
            System.out.println("El termómetro está apagado, enciendalo por favor");
        }
    }

    public void datos(){
        System.out.println("Termómetro marca " + marca + " color " +color);
    }
}
