package Jimmy.clases;

public class Mago {
  private String nombre;
  private String sexo;
  private int nivel;
  private int mana;
  private int puntosvida;
  private int puntosmanamaximo;
  private Habilidad habilidad;

  public Mago(String nombre, String sexo, Habilidad habilidad) {
    setNombre(nombre);
    setSexo(sexo);
    setHabilidad(habilidad);
    nivel = 1;
    mana = 50;
    puntosvida = 100;
    puntosmanamaximo = 1000;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Habilidad getHabilidad() {
    return habilidad;
  }

  public void setHabilidad(Habilidad habilidad) {
    this.habilidad = habilidad;
  }

  public void atacar() {
    System.out.println("Has atacado");
    this.mana = mana - 10;
  }

  public void defender() {
    System.out.println("Has defendido");
    this.nivel = nivel + 10;
  }

  public void lanzarHechizo(String hechizo) {
    System.out.println("Has lanzado un hechizo");
  }
}
