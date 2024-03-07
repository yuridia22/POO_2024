public class Nota {
    private String fecha;
    private String importancia;
    private String nota;
    private String fechaLim;
    private String autor;

    public Nota (String fecha, String nota, String fechaLim){
        setFecha(fecha);
        setImportancia("URGENTE");
        setNota(nota);
        setFechaLim(fechaLim);
        setAutor("Emir");
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha.equals("")?" ":fecha;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia.equals("")?"URGENTE":importancia;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota.equals("")?" ":nota;
    }

    public String getFechaLim() {
        return fechaLim;
    }

    public void setFechaLim(String fechaLim) {
        this.fechaLim = fechaLim.equals("")?" ":fechaLim;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor.equals("")?" ":autor;
    }

    public String toString(){
        return("\t\t\t\t\t" + getFecha() + "\n" + getImportancia() + "\n" + getNota() + "\nFecha límite: \n\t" + getFechaLim() + "\n" + getAutor() + "\u001B[0m");
    }
}