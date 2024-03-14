public class HolaMundo {
    private String color;
    private String texto;

    public HolaMundo(String texto, String color) {
        setTexto(texto);
        setColor(color);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

      public void setColor(String color) {
      switch (color) {
         case "azul" :
         case "verde" :
         case "rojo" :
            this.color = color;
            break;
      }
   }

    public String verDatos() {
        return "Texto: " + getTexto() + "\nColor: " + getColor();
    }

    public String getColor() {
        return color;
    }

    public static class Main {
        public static void main(String[] args) {
            HolaMundo holamundo = new HolaMundo("Hola Mundo", "azul");
            System.out.println(holamundo.verDatos());
        }
    }
}