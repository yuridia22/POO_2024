public class Temperatura{
    private double valor;
    private char uniMedida;
    private Color c;

    public Temperatura(double valor, char uniMedida){
        setValor(valor);
        setUniMedida(uniMedida);
    }
    public Temperatura(){
        setValor(36);
        setUniMedida('C');
        
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public char getUniMedida(){
        return uniMedida;
    }
    public void setUniMedida(char uniMedida){
        this.uniMedida=uniMedida;
    }
    public void setColor(String color) {
        this.c.setColor(color);
    }
    public String toString(){
        return c.getColorANSI() + getValor() +"° "+ getUniMedida();
    }
}