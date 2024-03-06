public class Loro {
    private String nombre;
    private int estado;
    private double edad;
    private String color;


    public Loro () {
        setNombre("Mike");
        estado= 1;
        setColor("Verde");
        edad= 3.4;

    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre.equals("")?"Carlos":nombre;
    }

    public int getEstado(){
        return estado;
    }

    public void setEstado(int valor){
        this.estado = estado; 
    }

    public void cantar(){
        if (getEstado()>0) {
            System.out.println("tururun, tururun, turururu, tururururuuu");   
        }
        else{
            System.out.println("*No dice nada*");
        }
    }
    public void hablar(){
        System.out.println("Dame una galleta!!");
    }

    public void picotear(){
        System.out.println("tuc, tuc, tuc, tuc, tuc, tuc");
    }

    public void aletear(){
        System.out.println("Feli");
    }

    public void comer(){
        System.out.println("*Come*");
    }
    public void morir(){
        System.out.println("*Se muere epicamente*");
        setEstado(0);
    }
}