package Trabjaos;

public class Nota {
    private Color color;
    private String fecha;
    private String nivel;
    private String texto;
    private String autor;
    private String fechaLimite;

    Nota(String autor) {
        setAutor(autor);

    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = new Color(color);

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor.equals("") ? "Julian" : autor;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void show() {

        System.out.println(
                color.getColorAnsi() + "fecha: " + fecha + "\n" + "Nivel: " + nivel + "\n" + texto + "\n" + "Autor: "
                        + autor + "\n"
                        + "Fecha limite: " + fechaLimite + "\033[37m");
    }

    public void guardar() {
        System.out.println("La nota se guardo correctamente");
    }
}
