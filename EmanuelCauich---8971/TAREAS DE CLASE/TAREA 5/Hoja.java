import java.time.LocalDate;

public class Hoja {
    private LocalDate fecha;
    private String tipo;
    private String texto;
    private LocalDate fechaLimite;
    private String autor;
    private Color color;

    public Hoja(int año, int mes, int dia, String tipo, String texto, String autor, int año2, int mes2, int dia2) {
        setFecha(LocalDate.of(año, mes, dia));
        setTipo(tipo);
        setTexto(texto);
        setFechaLimite(LocalDate.of(año2, mes2, dia2));
        setAutor(autor);
        this.color = new Color("azul");
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void imprimir() {
        String detalles = obtenerImprimirComoCadena();
        System.out.println(detalles);
    }
    
    public String obtenerImprimirComoCadena() {
        String borde = color.getColorAnsi() + "*********************************************************************\n";
        String contenido = "                                                           " + fecha + "\n" +
            "Tipo == " + tipo + "\n" +
            texto + "\n" +
            "Fecha limite:\n" +
            "         " + fechaLimite + "\n" +
            "Autor = " + autor + "\n";
        
        return borde + contenido + borde;
    }
    
}