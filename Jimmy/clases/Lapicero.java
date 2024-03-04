package Jimmy.clases;

public class Lapicero {
  private String marca;
  private String color;
  private float grosor;
  private String tinta;

  public Lapicero(String marca, String color, float grosor, String tinta) {
    setMarca(marca);
    setColor(color);
    setGrosor(grosor);
    setTinta(tinta);
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public float getGrosor() {
    return grosor;
  }

  public void setGrosor(float grosor) {
    this.grosor = grosor;
  }

  public String getTinta() {
    return tinta;
  }

  public void setTinta(String tinta) {
    this.tinta = tinta;
  }

  public void escribir(String texto) {
    System.out.println(texto);
  }

  public void rayar() {
    System.out.println("Has rayado");
  }
}
