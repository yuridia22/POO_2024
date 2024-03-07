public class Temperatura{
    private double valor;
    private char uniMedida;
    private Color color;

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
    public String toString(){
        return color.getColorANSI() + getValor() +"° "+ getUniMedida();
    }
}