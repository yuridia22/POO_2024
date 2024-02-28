public class Gato{
    //atributos//
    private String nombre;
    private String genero;
    private double edad;
    private String color;
    private double peso;
    private double altura;
    private String colorojos;
    private String raza;
    //constructor//
    public Gato (String nombre){
        this.nombre=nombre.equals("")?"Bolas":nombre;
        this.genero="macho";
        this.edad=3;
        this.color="blanco";
        this.peso=20.0;
        this.altura=28;
        this.colorojos="negros";
        this.raza="malish";
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre.equals("")?"Bolas":nombre;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero.equals("")?"Macho":genero;
    }
    public double getEdad(){
        return edad;
    }
    public void setEdad(double edad){
        this.edad=(edad<3.0)?3.0:edad;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color.equals("")?"Blanco":color;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso=(peso <20.0)?20.0:peso;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura=(altura <28.0)?28.0:altura;
    }
    public String getColorojos(){
        return colorojos;
    }
    public void setColorOjos(String colorojos){
        this.colorojos=colorojos.equals("")?"Negros":colorojos;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza.equals("")?"Malish":raza;
    }
    //metodos//
    public void maullar() {
        System.out.println("¡Miau, miau!");
    }
    public void jugar(String juguete) {
        System.out.println("Estoy jugando con mi " + juguete);
    }
    public void dormir() {
        System.out.println("Zzz... estoy durmiendo");
    }
    public void comer(String comida) {
        System.out.println("Estoy comiendo " + comida);
    }
    public void lamerse() {
        System.out.println("Me estoy lamiendo para limpiarme");
    }
    public void explorar() {
        System.out.println("Estoy explorando el entorno");
    }
}