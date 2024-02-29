public class HolaMundoOO {
    private String color;
    private int sizeText;

    // Constructor
    public HolaMundoOO() {
        this.color = "\u001B[0m"; // Reset color
        this.sizeText = 12;
    }

    // Constructor con parámetros
    public HolaMundoOO(String color, int sizeText) {
        this.color = color;
        this.sizeText = sizeText;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSizeText() {
        return sizeText;
    }

    public void setSizeText(int sizeText) {
        this.sizeText = sizeText;
    }

    // Método para imprimir el saludo
    public void imprimir() {
        System.out.println(color + "¡Hola Mundo!" + "\u001B[0m"); // Reset color after printing
    }

    // Método main
    public static void main(String[] args) {
        // Crear un objeto HolaMundoOO
        HolaMundoOO HolaMundo = new HolaMundoOO();

        // Imprimir con los valores por defecto
        HolaMundo.imprimir();

        // Cambiar el color y tamaño de texto
        HolaMundo.setColor("\u001B[34m"); // Azul
        HolaMundo.setSizeText(16);

;
    }
}