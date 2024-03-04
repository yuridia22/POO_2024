import java.time.LocalDate;

public class Hoja {
    private LocalDate fecha;
    private String tipo;
    private String texto;
    private LocalDate fechaLimite;
    private String autor;
    private String color;

    public Hoja(int dia, int mes, int año, String tipo, String texto, String autor, int dia2, int mes2, int año2, String color) {
        setFecha(LocalDate.of(año, mes, dia));
        setTipo(tipo);
        setTexto(texto);
        setFechaLimite(LocalDate.of(año2, mes2, dia2));
        setAutor(autor);
        setColor(color);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
            case "azul":
                this.color = "\u001B[34m"; // Código ANSI para azul
                break;
            case "amarillo":
                this.color = "\u001B[33m"; // Código ANSI para amarillo
                break;
            case "rojo":
                this.color = "\u001B[31m"; // Código ANSI para rojo
                break;
            default:
                this.color = "\u001B[30m"; // Código ANSI para negro (por defecto)
                break;
        }
    }

    public void imprimir() {
        String borde = "\u001B[38;5;" + color + "*********************************************************************\u001B[0m";
        System.out.println(borde);
        System.out.println("\033[38;5;" + color + "                                                           " + fecha);
        System.out.println("\033[38;5;" + color + "Tipo == " + tipo);
        System.out.println("\033[38;5;" + color + texto);
        System.out.println("\033[38;5;" + color + "Fecha limite: ");
        System.out.println("\033[38;5;" + color + "         "+ fechaLimite);
        System.out.println("\033[38;5;" + color + "Autor = " + autor);
        System.out.println(borde);
    }
}
