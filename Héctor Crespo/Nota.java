import java.util.Scanner;

public class Notas {
    private String importancia;
    private String fecha;
    private String texto;
    private String fechaLimite;
    private String nombre;
    private Color color;

    public Notas(String importancia, String fecha, String texto, String fechaLimite, String nombre, String color) {
        color = new Color(color);
        setImportancia(importancia);
        setFecha(fecha);
        setTexto(texto);
        setFechaLimite(fechaLimite);
        setNombre(nombre);
        
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia.trim().isEmpty() ? "urgente" : importancia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha.trim().isEmpty() ? "19 de febrero" : fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto.trim().isEmpty() ? "Realiza la practica" : texto;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite.trim().isEmpty() ? "1 de febrero" : fechaLimite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim().isEmpty() ? "Jesus" : nombre;
    }
    public String show() {
        return (
            getColorHex() + "Importancia: " + getImportancia() + "\n" +
            "Fecha: " + getFecha() + "\n" +
            "Texto: " + getTexto() + "\n" +
            "Fecha Límite: " + getFechaLimite() + "\n" +
            "Nombre: " + getNombre() + "\n" +
            "\u001B[0m"
        );
    }

    public static void main(String[] args) {
        System.out.println(getColor);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Importancia: ");
        String importancia = scanner.nextLine();

        System.out.print("Fecha: ");
        String fecha = scanner.nextLine();

        System.out.print("Texto: ");
        String texto = scanner.nextLine();

        System.out.print("Fecha Límite: ");
        String fechaLimite = scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Color (negro, rojo, verde, amarillo, azul, por defecto): ");
        String color = scanner.nextLine();

        BlocDeNotas nota = new BlocDeNotas(importancia, fecha, texto, fechaLimite, nombre, color);
        System.out.println(nota.show());

        scanner.close();
    }
}