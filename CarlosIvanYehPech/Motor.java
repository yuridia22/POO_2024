public class Motor{
    private String modelo;
    private double potencia;

    public Motor(String modelo, double potencia){
        setModelo();
        setPotencia();
    }

    public void setModelo(String modelo){
        this.modelo = (modelo.equal(" "))? "izusu": modelo;
    }

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

    public String getModelo(){
        return modelo;
    }

    public double getPotencia(){
        return potencia;
    }
}
