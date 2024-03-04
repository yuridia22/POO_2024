package Nota;

public class Nota {
    private String fecha;
    private String importancia;
    private String nota;
    private String fechaLim;
    private Color c;
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
        this.fecha = fecha;
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
        this.nota = nota;
    }

    public String getFechaLim() {
        return fechaLim;
    }

    public void setFechaLim(String fechaLim) {
        this.fechaLim = fechaLim;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString(){
        return("\t\t\t" + getFecha() + "\n" + getImportancia() + "\n" + getNota() + "\nFecha límite: \n\t" + getFechaLim() + "\t" + getAutor()+ "\u001B[0m");
    }
}