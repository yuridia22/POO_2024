public class Nota {
    private String fecha;
    private String autor;
    private String tipodenota;
    private String fechalimite;
    private String texto;

    public Nota(String fecha, String autor, String tipoNota, String fechalimite, String texto){
        setFecha(fecha);
        setAutor(autor);
        setTipoNota(tipodenota);
        setFechaLimite(fechalimite);
        setTexto(texto);
        
    }    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String nombre){
        this.fecha = fecha.equals(" ")?"04/03/2023":fecha;
    }
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String nombre){
        this.autor = autor.equals(" ")?"Brayan":autor;
    }
    public String getTipodeNota(){
        return tipodenota;
    }
    
    public void setTipoNota(String nombre){
        this.tipodenota = tipodenota.equals(" ")?"Casual":nombre;
    }
    public String getFechaLimite(){
        return fechalimite;
    }
    
    public void setFechaLimite(String nombre){
        this.fechalimite = fechalimite.equals(" ")?"08/03/2023":nombre;
    }
    public String getTexto(){
        return texto;
    }
    
    public void setTexto(String texto){
        this.texto = texto.equals("")?"Cita alas 6:00PM en la peluqueria de rodo ":texto;
    }
    
    
}
