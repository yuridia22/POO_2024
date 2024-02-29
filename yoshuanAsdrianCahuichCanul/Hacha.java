public class Hacha {
    private String material;
    private int tamaño;
    private int peso;
    

    public Hacha(String material, int tamaño, int peso){
        setMaterial(material);
        setTamaño(tamaño);
        setPeso(peso);
    }
    public void setMaterial(String material){
        this.material = material.equals(" ") ? "titanio" : material;
    }
    public void setTamaño(int tamaño){
       this.tamaño = tamaño;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public String getMaterial(){
        return material;
    }
    public int getTamaño(){
        return tamaño;
    }
    public int getPeso(){
        return peso;
    }
    String accion;
    public void setAccion(String accion){
        switch (accion) {
            case "golpear": 
                this.accion = "golpear";
                break;
            case "barrido":
                this.accion = "barrido";
                break;
            default:
                this.accion = "defendiendo";
                break;
        }
    }
    public String getAccion(){
        return accion;
    }
    public static void main(String[] args) {
        Hacha h = new Hacha("oro", 75, 5);
        System.out.println(h.getPeso());
        System.out.println(h.getMaterial());
        System.out.println(h.getTamaño());
        h.setAccion("golpear");
        System.out.println(h.getAccion());
    }
}
