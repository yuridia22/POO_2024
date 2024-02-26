public class Arma {

  public String nombre;
  public String material;
  public String tipo;
  public float precio;

  public Arma(String tipo) {
    this.tipo = tipo.equals(" ")?"Armas de fuego":tipo;
    nombre = "Pistola";
    material = "Metal";
    precio = 12301.2f;
  }
//Setters y getters
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String a) {
    this.nombre=a;
  }
  public String getMaterial() {
    return material;
  }
  public void setMaterial(String b) {
    this.material=b;
  }
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String c) {
    this.tipo=c;
  }
  public float getPrecio() {
    return precio;
  }
  public void setPrecio(float d) {
    precio=d;
  }
//Metodos
  public void daniar() {
    System.out.println("Dañaste a tu oponente");
  }

  public void matar() {
    System.out.println("OH no mataste a tu oponente");
  }

  public void romperse() {
    System.out.println("Crack Crack Crack......");
  }
  public void info(){
    System.out.println("Nombre = " + nombre);
    System.out.println("Tipo = " + tipo);
    System.out.println("Material = " + material);
    System.out.println("Precio = " + precio);
  }

}