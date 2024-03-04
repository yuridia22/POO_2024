
public class Lampara {
    private String material;
    private String colorlam;
    private boolean interruptor;
    private String tipoLamp;

    public Lampara(String material, String colorlam, boolean interruptor, String tipoLamp){
        setMaterial(material);
        setColorLam(colorlam);
        setInterruptor(interruptor);
        setTipoLamp(tipoLamp);
    }

    public void setMaterial(String material) {
        this.material = material.equals("")?"Metal":material;
    }
    public String getMaterial(){
        return material;
    }
    public void setColorLam(String colorlam){
        this.colorlam=colorlam.equals("")?"Gris":colorlam;
    }
    public String getColorLam(){
        return colorlam;
    }
    public void setInterruptor(boolean interruptor){
        this.interruptor=interruptor;
        if (interruptor) {
            System.out.println("la Lampara esta encendida");
        } else {
            System.out.println("La lampara esta apagada");
        }
    }
    public boolean getInterruptor(){
        return interruptor;
    }
    public void setTipoLamp(String tipoLamp){
        this.tipoLamp=tipoLamp.equals("")?"Lampara de escritorio":tipoLamp;
    }
    public String getTipoLamp(){
        return tipoLamp;
    }
}
