public class Gato {
    private String nombre;
    private String color;
    private int edadMeses;
    private boolean vivo;

    //constructor :v

    public Gato (String nombre, String color, int edadMeses, boolean vivo){
        this.nombre = nombre.equals("")?"cokie": nombre;
        this.color = color.equals("")?"naranja": color;
        this.edadMeses = edadMeses;
        this.vivo = vivo;
    }

    //sets

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("")?"cokie": nombre;
    }

    public void setColor(String color) {
        this.color = color.equals("")?"naranja": color;
    }

    public void setEdadMeses(int edadMeses) {
        this.edadMeses = edadMeses;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    //gets

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getEdadMeses() {
        return edadMeses;
    }

    public boolean isVivo() {
        return vivo;
    }

    //metodos
    
    public void morir() {
    if (vivo) {vivo = false;} else {}
}

     public void crecerEdad(int cantidad) {this.edadMeses += cantidad;}

    public String maullar(){
        if(isVivo() == true){
           return getNombre() + ": MIAU MIAU";
        } 
        else{
            return getNombre()  + " Esta muerto no puede maullar";
        }
    }

     public String comer(){
        if(isVivo() == true){
           return getNombre() + ": Esta comiendo ñom ñom";
        } 
        else{
            return getNombre()  + " Esta muerto no puede comer";
        }
    }

     public String dormir(){
        if(isVivo() == true){
           return getNombre() + ": Esta durmiendo";
        } 
        else{
            return getNombre()  + " Ya lleva durmiendo desde hace dias y no despierta";
        }
    }

     public String limpiarse(){
        if(isVivo() == true){
           return getNombre() + ": Se esta lamiendo su pelo";
        } 
        else{
            return getNombre()  + " No se puede limpiar solo, esta muerto";
        }
    }

     public String saltar(){
        if(isVivo() == true){
           return getNombre() + ": Da un salto y se sube en algo";
        } 
        else{
            return getNombre()  + " Esta muerto no puede saltar";
        }
    }

    public String mostrar(){
        return "Nombre: " + getNombre() + "  Color: " + getColor() + "  Edad en meses: " + getEdadMeses() + " meses"+ "  Estado(vivo,muerto): " + isVivo();
    }

}