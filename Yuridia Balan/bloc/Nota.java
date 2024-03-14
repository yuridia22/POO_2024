public class Nota {
    private String urgencia; 
    private String fecha;
    private String fechaL;
    private String texto;
    private Color color;

    public Nota(String urgencia, String fecha, String fechaL, String texto) {
        setUrgencia(urgencia);
        setFecha(fecha);
        setFechaL(fechaL);
        setTexto(texto);
        color = new Color("verde");
    }

    public String getUrgenciao() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia.equals("")?"URGENTE":urgencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
     
    public String getFechaL() {
        return fechaL;
    }

    public void setFechaL(String fechaL) {
       this.fechaL = fechaL.equals("")?fecha:fechaL;
    }

    public String getTexto(){
      return texto;
    }

   public void setTexto(String texto) {
        this.texto = texto.equals("")?"Hacer mi ensayo":texto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color.setColor(color);;
    }

    public String toString() {
        return(color.getcANSI() + "Fecha: " + getFecha() + "\nTitulo: " + getUrgenciao() + "\nFechaL: " + getFechaL() + "\nTexto: " + getTexto()+ "\u001B[0m");
    }
}