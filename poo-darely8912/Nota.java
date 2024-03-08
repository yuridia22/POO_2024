import java.util.Date;

public class Nota {
    private String titulo;
    private String contenido;
    private Date fechaCreacion;
    private String color;

    
    public Nota(String titulo, String contenido, Date fechaCreacion, String color) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.color = color;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public void crear() {
        System.out.println("La nota ha sido creada.");
    }

    public void editar() {
        System.out.println("La nota ha sido editada.");
    }

    public void borrar() {
        System.out.println("La nota ha sido borrada.");
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El color de la nota ha sido cambiado a: " + nuevoColor);
    }
}
