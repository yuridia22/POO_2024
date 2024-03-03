public class Vehiculo{
    private String marca;
    private boolean estado;
    private int velocidad;

    public Vehiculo(String marca, boolean estado, int velocidad){
        setMarca();
        setEstado();
        setVelocidad();
    }

    public void setMarca(String marca){
        this.marca = (marac.equals(" "))?"Chevrolet" : marca;
    }

    public void setEstado(boolean estado){
        estado = false;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    public String getMarca(){
        return marca;
    }

    public boolean getEstado(){
        return estado;
    }

    public int getVelocidad(){
        return velocidad;
    }
    
}
