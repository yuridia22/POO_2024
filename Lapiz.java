public class Lapiz{
    //atributos//
    private String size;
    private String color;
    private String colorgoma;
    private int peso;
    private double precio;
    private String material;
    private String forma;
    //constructor//
    public Lapiz (String size,int peso,double precio){
        this.size= size.equals("")?"mediano":size;
        this.color= "amarillo";
        this.colorgoma= "blanco";
        this.peso= (peso>=50)?peso:50;
        this.precio = (precio <= 4.0) ? precio:4.0;
        this.material= "madera";
        this.forma= "cilindrico";
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size=size.equals("")?"mediano":size;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color.equals("")?"amarillo":color;
    }
    public String getColorgoma(){
        return colorgoma;
    }
    public void setColorgoma(String colorgoma){
        this.colorgoma=colorgoma.equals("")?"blanco":colorgoma;
    }
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso=(peso <50)? 50:peso;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio=(precio <4.0)?4.0:precio;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material=material.equals("")?"madera":material;
    }
    public String getForma(){
        return forma;
    }
    public void setForma(String forma){
        this.forma=forma.equals("")?"cilindrico":forma;
    }

    //metodos//
    public void escribe(Estudiante estudiante) {
        System.out.println(estudiante.getNombre() + " está escribiendo con el lapiz " + getColor()+", el lapiz pesa "+getPeso());
    }
    public void borrar(Estudiante estudiante) {
        System.out.println(estudiante.getNombre() + " está borrando con el lapiz");
    }
    public void guardar(Estudiante estudiante){
        System.out.println(estudiante.getNombre()+" Esta guardando el lapiz");
    }
}