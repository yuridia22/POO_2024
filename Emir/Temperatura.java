public class Temperatura {
    private double temperatura;
    private String unidad;
    private int rangoMax;
    private int rangoMin;

    public Temperatura(String unidad){
        setTemperatura(temperatura);
        setUnidad(unidad);
        setRangoMax(100);
        setRangoMin(0);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getRangoMax() {
        return rangoMax;
    }

    public void setRangoMax(int rangoMax) {
        this.rangoMax = rangoMax;
    }

    public int getRangoMin() {
        return rangoMin;
    }

    public void setRangoMin(int rangoMin) {
        this.rangoMin = rangoMin;
    }

    public double medirTemp(){
            double temperatura = (int)(Math.random() * (rangoMax-rangoMin) + rangoMin);
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
            return temperatura;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nTemperatura: " + medirTemp() + " " + getUnidad());
    }
}
