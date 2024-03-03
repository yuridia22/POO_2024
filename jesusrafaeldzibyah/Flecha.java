public class Flecha {
    private String material;
    private String nombre;

    public Flecha(String material, String nombre){
        setNombre(nombre);
        setMaterial(material);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("")?"Flecha":nombre;
    }
    public void setMaterial(String material){
        this.material=material.equals("")?"piedra":material;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMaterial(){
        return material;
    }

    public String lanzar(){
        return"fiuuum";
    }
}
