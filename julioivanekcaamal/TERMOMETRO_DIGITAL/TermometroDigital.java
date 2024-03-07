package julioivanekcaamal.TERMOMETRO_DIGITAL;

public class TermometroDigital {
     /////////////////////////////////////////////atributos
     private String marca;
     private String color;
     private int tempMax;
     private int tempMin;
     private int valor;
     private char temperatura;
 
     /////////////////////////////////////////constructor
     public TermometroDigital(String marca,String color,int tempMax, int tempMin, int valor, char temperatura){
         setMarca(marca);
         setColor(color);
         this.tempMax = tempMax;
         this.tempMin = tempMin;
         this.valor = valor;
         this.temperatura = temperatura;
     }
     public String getMarca(){
         return marca;
     }
     public void setMarca(String marca){
         this.marca = marca.equals( " ")? "==Steren==" : marca;
     }
     public String getColor(){
         return color;
     }
     public void setColor(String color){
         this.color = color.equals(" ")? "blanco" : color;
     }
     public int getTempMax(){
         return tempMax;
     }
     public void setTempMax(int tempMax){
         this.tempMax = tempMax;
     }
     public int getTempMin(int tempMin){
         return tempMin;
     }
     public void setTempMin(int tempMin){
         this.tempMin = tempMin;
     }
     public int getValor(){
         return valor;
     }
     public void setValor(int valor){
         this.valor = valor;
     }
     public char getTemperatura(){
         return temperatura;
     }
     public void setTemperatura(char temperatura){
         this.temperatura = temperatura;
     }
 
     public void conversorTemp(){
 
     }
     public void mostrarTemp(){
 
     }  
}
