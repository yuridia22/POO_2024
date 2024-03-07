public class Computadora {
    private String marca;
    private String color;
    private String modelo;
    private String memoriaRAM;
    private String tipoSistema;

    public Computadora(String marca, String color, String modelo, String memoriaRAM, String tipoSistema){
        setMarca(marca);
        setColor(color);
        setModelo(modelo);
        setMemoriaRAM(memoriaRAM);
        setTipoSistema(tipoSistema);
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca.equals("")?"Lenovo":marca;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color.equals("")?"azul":color;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo.equals("")?"23":modelo;
    }
    public String getMemoriaRAM(){
        return memoriaRAM;
    }
    public void setMemoriaRAM(String memoriaRAM){
        this.memoriaRAM=memoriaRAM.equals("")?"6 gb":memoriaRAM;
    }
    public String getTipoSistema(){
        return tipoSistema;
    }
    public void setTipoSistema(String tipoSistema){
        this.tipoSistema=tipoSistema.equals("")?"Windows":tipoSistema;
    }
    public void encender(){
        System.out.println("La computadora se ha encendido");
    }
    public void reiniciar(){
        System.out.println("La computadora se ha reiniciado");
    }
    public void apagar() {
        System.out.println("La computadora se ha apagado.");
    }
}
