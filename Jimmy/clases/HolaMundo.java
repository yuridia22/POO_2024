package Jimmy.clases;

public class HolaMundo {
  private String mensaje;
  private String color;
  private float tamanio;

  public HolaMundo(String mensaje, String color, float tamanio) {
    setMensaje(mensaje);
    setColor(color);
    setTamanio(tamanio);
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public float getTamanio() {
    return tamanio;
  }

  public void setTamanio(float tamanio) {
    this.tamanio = tamanio;
  }

  public void holaMundo() {
    System.out.println("Hola Mundo");
  }
}
