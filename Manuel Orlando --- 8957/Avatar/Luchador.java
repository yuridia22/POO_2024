public class Luchador {

  private String estiloCombate;
  private int fuerza;
  private float altura;
  private float peso;
  private String nombre;
  private int velocidadReaccion;
  private boolean rendirse;
  
  public Luchador(String s) {
    setEstiloCombate(s);
    setFuerza(50);
    setAltura(1.56f);
    setPeso(60.5f);
    setNombre("Canelo");
    setVelocidadReaccion(50);;
    setRendirse(false);;
  }
  public String getEstiloCombate() {
    return estiloCombate;
  }
  public void setEstiloCombate(String s) {
    this.estiloCombate = s.equals("")?"Boxeo":s;
  }
  public int getFuerza() {
    return fuerza;
  }
  public void setFuerza(Integer f) {
    this.fuerza = f;
  }
  public float getAltura() {
    return altura;
  }
  public void setAltura(float a) {
    this.altura = a;
  }
  public float getPeso() {
    return peso;
  }
  public void setPeso(float p) {
    this.peso = p;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String n) {
    this.nombre = n;
  }
  public int getVelocidadReaccion() {
    return velocidadReaccion;
  }
  public void setVelocidadReaccion(int v) {
    this.velocidadReaccion = v;
  }
  public boolean getRendirse() {
    return rendirse;
  }
  public void setRendirse(boolean r) {
    this.rendirse = r;
  }
  public void golpear() {
    System.out.println("Pum Pum Pum Pum.....");
  }
  public void esquivar() {
    System.out.println("Agacharse");
  }
  public void moverse() {
    System.out.println("Alejarse medio metro");
  }
  public void rendirse() {
    System.out.println("Me rindo");
    rendirse=true;
  }
  public void entrenar() {
    System.out.println("No se ha visto durante dos años, entreno en las montañas");
  }
  public void hablar() {
    System.out.println("Hola me llamo " + nombre);
  }
  public void devolverInfo(){
    System.out.println("Nombre " + nombre);
    System.out.println("Estilo de combate " + estiloCombate);
    System.out.println("Altura = " + altura);
    System.out.println("Peso = " + peso);
    System.out.println("Velocidad de Reaccion = " + velocidadReaccion);
    System.out.println("Rendirse = " + rendirse);
  }
}