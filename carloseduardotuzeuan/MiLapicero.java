public class MiLapicero {
    //atributos
    private String color;
    private String marca;
    private boolean tamaño;
    private String material;

    public MiLapicero(String color, String marca, String material, boolean tamaño){
        setColor(color);
        setMarca(marca);
        setMaterial(material);
        setTamaño(tamaño);
   }
    //metodos
    public void setColor(String color){
        this.color=color.equals("") ? "amarillo" :color;
    }
   public String getColor(){
    return color;
   }
   public void setMarca(String marca){
    this.marca=marca.equals("")?"Es marca Bic":marca;
   }
   public String getMarca(){
    return marca;
   }
   public void setTamaño(boolean tamaño){
    this.tamaño=tamaño;
    if (tamaño) {
        System.out.println("EL lapicero es mediano");
    } else{
        System.out.println("El lapicero es pequeño");
    }
   }
   public boolean getTamaño(){
    return tamaño;
   }
   public void setMaterial(String material){
    this.material=material.equals("")?"El lapicero es de plastico":material;
   }
   public String getMaterial(){
    return material;
   }
   //metodos de accion
   public void informacion(){
    System.out.println("color: "+getColor());
    System.out.println("marca: "+getMarca());
    System.out.println("material: "+getMaterial());
  
   }
}
