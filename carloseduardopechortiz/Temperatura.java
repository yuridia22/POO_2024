public class Temperatura {
    private double valor;
    private char unidad;

    public Temperatura (double calor, char unidad){
        set(valor);
        set(valor);
    }

    public double getvalor(){
        return valor;
    }

    public void  setvalor(double valor){
        this.valor = valor;
    }

    public char getunidad(){
        return unidad;
    }

    public void setunidad(char unidad){
        this.unidad = unidad == 'f' || unidad == 'k' unidad || == unidad 'c'? unidad :'c';
        // validar si es una valor estamos buscando 
    }



}
