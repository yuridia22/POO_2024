public class Arma{
    private String tipo;
    private int cartucho;
    private String nombre;

    public Arma(String tipo, int cartucho, String nombre){
        setTipo();
        setCartucho();
        setNombre();
    }

    public void setTipo(String tipo){
        this.tipo = (tipo.equals(" "))? "Asalto": tipo;
    }

    public void setCartucho(int cartucho){
        this.cartucho = cartucho;
    }

    public void setNombre(String nombre){
        this.nombre = (nombre.equals(" "))?"AK-47": nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public int getCArtucho(){
        return cartucho;
    }

    public String getNombre(){
        return nombre;
    }
    

    
}
