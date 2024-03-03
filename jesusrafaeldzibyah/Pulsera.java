public class Pulsera {
    private String color;
    private String material;
    private int circunferencia;// en mm
    private boolean estado;//true=puesto false=nada

    public Pulsera(String color, String material, int circunferencia, boolean estado){
        setColor(color);
        setMaterial(material);
        setCircunferencia(circunferencia);
        setEstado(estado);
    }

    public void setColor(String color){
        this.color=color.equals("")?"Azul":color;
    }
    public String getColor(){
        return color;
    }
    public void setMaterial(String material){
        this.material=material.equals("")?"goma":material;
    }
    public String getMaterial(){
        return material;
    }
    public void setCircunferencia(int circunferencia){
        this.circunferencia=(circunferencia<=0 || circunferencia>210)?180:circunferencia;
    }
    public int getCircunferencia(){
        return circunferencia;
    }
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    public boolean getEstado(){
        return estado;
    }

    public String poner(){
        String p=(this.estado != true)?"La pulsera esta puesta":"No se puede poner una pulsera ya puesta";
        this.estado=true;
        return p;
    }
    public String quitar(){
        String q=(this.estado!=false)?"Se quito la pulsera":"No se puede quitar una pulsera que no esta puesta";
        this.estado=false;
        return q;
    }

}
