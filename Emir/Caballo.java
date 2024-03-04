

public class Caballo {
    private String nombre;
    private String color;
    private boolean armadura;

    public Caballo(String nombre, String color){
        setNomC(nombre);
        setColor(color);
        setArm(false);
    }

    public String getNomC(){
        return nombre;
    }

    public void setNomC(String nom){
        this.nombre = nom;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public boolean getArm(){
        return armadura;
    }

    public void setArm(boolean a){
        this.armadura = a;
    }

    public void comer(String comida){
        System.out.println("Que rica " + comida);
    }

    public void montar(){
        System.out.println("Arre " + getNomC() + " es hora de la batalla");
    }

    public void datos(){
        System.out.println("Caballo:\nNombre: " + nombre + "\nColor: " + color);
    }
}
