public class Escudo {
    private String material;
    private int peso;
    private int tamaño;
    

    public Escudo(String material, int tamaño, int peso){
        setMaterial(material);
        setTamaño(tamaño);
        setPeso(peso);
    }
    public void setMaterial(String material){
        this.material = material.equals(" ") ? "madera" : material;
    }
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }

    String defender;
    public void Defender(String defender){
        switch (defender) {
            case "cubrir":this.defender = "defendiendo";
                break;
            case "empujar":this.defender= "empujaste";
                break;
        
            default:this.defender = "atacando";
                 break;
        }
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
    public String getDefender(){
        return defender;
    }



    public   String mostrarM(){
        return  material;
    }
    public int mostrarT(){
        return tamaño;
    }
    public int mostrarP(){
        return peso;
    }
    public String mostrarD(){
        return defender;
    }
    public static void main(String[] args) {
        //tamaño en metro,  peso = kg
        Escudo e = new Escudo("madera", 1, 4);
        System.out.println(e.mostrarM());
        e.Defender("cubrir");
        System.out.println(e.mostrarD());
        System.out.println(e.mostrarP());
        System.out.println(e.mostrarT());

    }
}