public class Bala{
    private double calibre;
    private String tipo;

    public Bala(double calibre, String tipo){
        setCalibre();
        setTipo();
    }

    public void setCalibre(double calibre){
        this.calibre = calibre;
    }

    public void setTipo(String tipo){
        this.tipo = (tipo.equals(" "))? "Expanciva" : tipo;
    }
}
