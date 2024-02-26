package Practica1;

public class Pedido {
    @SuppressWarnings("unused")
    private Libro l1;
    @SuppressWarnings("unused")
    private Lector le1;
    @SuppressWarnings("unused")
    private Bibliotecario b1;
    private String fecha;

    public Pedido(String fecha){
        setFecha(fecha);
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }
}