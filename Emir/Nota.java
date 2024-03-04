public class Nota {
    private String fecha;
    private String importancia;
    private String nota;
    private String fechaLim;
    private String color;
    private String colorHex;

    public Nota (String fecha, String nota, String fechaLim, String color){
        setFecha(fecha);
        setImportancia("URGENTE");
        setNota(nota);
        setFechaLim(fechaLim);
        setColor(color);
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
        this.importancia = importancia;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color) {
            case "azul" :
            this.color = color;
            setColorHex("\u001B[34m");
                break;
            case "verde" :
            this.color = color;
            setColorHex("\u001B[32m");
                break;
            case "rojo" :
                this.color = color;
                setColorHex("\u001B[31m");
                break;
            case "amarillo" :
                this.color = color;
                setColorHex("\u001B[33m");
                break;
            case "morado" :
                this.color = color;
                setColorHex("\u001B[35m");
                break;
            case "cian" :
                this.color = color;
                setColorHex("\u001B[36m");
                break;
            case "negro" :
                this.color = color;
                setColorHex("\u001B[30m");
            default: 
                this.color = color;
                setColorHex("\u001B[37m");
                break;
        }
    }

    public String getColorHex(){
        return colorHex;
    }

    public void setColorHex(String colorHex){
        this.colorHex = colorHex;
    }

    public String escribir(){
        return(getColorHex() + "\t\t\t" + getFecha() + "\n" + getImportancia() + "\n" + getNota() + "\nFecha límite: \n\t" + getFechaLim() +  "\u001B[0m");
    }

    public static void main(String[] args) {
        Nota n = new Nota("03/03/2024", "Realizar mi tarea de programación", "04/03/2024", "azul");
        System.out.print(n.escribir());
    }
}
