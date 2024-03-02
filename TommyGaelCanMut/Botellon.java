public class Botellon {
    private String nombre;
    private double tamaño;
    private String color;
    private String material;
    private String marca;
    private boolean estado;
    private boolean estadoAviertoCerrado;
    private boolean abiero;

    public Botellon(String nombre, double tamaño, String color, String material, String marca, boolean estado) {
        this.setNombre(nombre);
        this.setTamaño(tamaño);
        this.setColor(color);
        this.setMaterial(material);
        this.setMarca(marca);
        this.setBotellon(estado);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAbierto(boolean a) {
        this.abiero=a;
    }
    public void setAbiertoCerrado(boolean aa) {
        this.estadoAviertoCerrado=aa;
    }
    public boolean setAbiertoCerrado() {
        return estadoAviertoCerrado;
    }
    public boolean getAbierto(){
        return abiero;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setBotellon(boolean botellon){
        this.estado = botellon;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getMarca() {
        return marca;
    }
    public boolean getBotellon(){
        return estado;
    }

    public void botellon() {
        if (!estado) {
            System.out.println(" El "+nombre+"es de color "+color+","+"su tamaño es "+tamaño+"y es del material "+material+"su marca es "+marca);
        } else {
            System.out.println("El botellon es muy pesado");
        }
    }
    public void abrir(){
        if (!estado){
            setBotellon(true);
        }
    }
    public void rellenar(String rellenar){
        if (estado){
            System.out.println("El botellon esta lleno "+rellenar);
            setAbiertoCerrado(true);
        } else {
            System.out.println("El botellon esta cerrado");
        }
    }
    public void vaciar(){
        if(estado){
            if(estadoAviertoCerrado){
                System.out.println("Se ha vaciado");
                setAbiertoCerrado(false);
            }else{
                System.out.println("El botellon no contiene nada");
            }
        }else{
        System.out.println("el bottelon esta cerrado");
        }
    }

}