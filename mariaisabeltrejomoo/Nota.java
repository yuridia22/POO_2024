public class Nota{
    private String fecha;
    private String tipo;
    private String cuerpoNota;
    private String fechaLimite;
    private String autor;

    public Nota (String fecha, String tipo, String cuerpoNota, String fechaLimite, String autor){
        setFecha(fecha);
        setTipo(tipo);
        setCuerpoNota(cuerpoNota);
        setFechaLimite(fechaLimite);
        setAutor(autor);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo.equals(" ")?"URGENTE":tipo;
    }

    public String getCuerpoNota() {
        return cuerpoNota;
    }

    public void setCuerpoNota(String cuerpoNota) {
        this.cuerpoNota = cuerpoNota;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite){
		this.fechaLimite=fechaLimite;
	}

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor=autor.equals(" ")?"Isabel":autor;
    }

    public String toString(){
        return("   " + getFecha() + "\n" + getTipo() + "\n" + getCuerpoNota() + "\nFecha limite: "+getFechaLimite() + "\n" + getAutor()+"\033[35m");
    }
}