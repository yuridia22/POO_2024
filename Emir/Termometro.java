import java.text.DecimalFormat;

public class Termometro {
    private int estado;
    private Temperatura temp;

    public Termometro(){
        setEstado(0);
    }
    
    public Termometro(int estado, String unidad) {
        setEstado(estado);
        temp = new Temperatura(unidad);
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int e) {
        this.estado = e;
    }

    public Temperatura getTemp() {
        return temp;
    }

    public void setTemp(Temperatura temp) {
        this.temp = temp;
    }

    private String convertir() {
        double temperatura = temp.getTemperatura();
        DecimalFormat dm = new DecimalFormat("00.00");
        switch (temp.getUnidad()) {
            case "celsius":
                double tempFc = (temperatura - 32) / 1.8;
                double tempKc = temperatura - 273;
                return "°F: " + dm.format(tempFc) + " - °K: " + dm.format(tempKc);
            case "farenheit":
                double tempCf = (temperatura * 1.8) + 32;
                double tempKf = (temperatura - 273) * 1.8 + 32;
                return "°C: " + dm.format(tempCf) + " - °K: " + dm.format(tempKf);
            case "kelvin":
                double tempCk = temperatura + 273;
                double tempFk = (temperatura - 32) / 1.8 + 273;
                return "°C: " + dm.format(tempCk) + " - °F: " + dm.format(tempFk);
            default:
                return null;
        }
    }

    public void datos(){
        if (estado == 1) {
            System.out.println("\t\t__________________________\t_________\n\t\t|Temperatura: " + temp.medirTemp() + " " + temp.getUnidad() + "|\t|" + temp.getRangoMax() + " - " + temp.getRangoMin() + "|\n\t\t¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\t¯¯¯¯¯¯¯¯¯\n\t        _________________________\n\t        |" + convertir() + "|\n\t        ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }
        else{
            System.out.println("El termómetro está apagado, enciéndalo por favor");
        }
    }
}
