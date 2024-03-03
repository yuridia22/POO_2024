public class Arco {
    private String material;
    private String nombre;

    public Arco(String material, String nombre){
        setNombre(nombre);
        setMaterial(material);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("")?"arco":nombre;
    }
    public void setMaterial(String material){
        this.material=material.equals("")?"madera":material;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMaterial(){
        return material;
    }

    public String disparar(Flecha f){
        return f.lanzar();
    }
}
