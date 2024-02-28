package Jimmy.clases;

public class Perro {
  private String nombre;
  private int edad;
  private String raza;

  public Perro(String nombre, int edad, String raza) {
    setNombre(nombre);
    setEdad(edad);
    setRaza(raza);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
}
