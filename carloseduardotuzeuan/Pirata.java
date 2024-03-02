public class Pirata {
    private boolean ojo;
    private boolean pies;
    private boolean barba;
    private String nombre;

//constructor
public Pirata(String nombre, boolean ojo, boolean barba, boolean pies){
    setNombre(nombre);
    setBarba(barba);
    setOjo(ojo);
    setPies(pies);

}

//metodos de acceso
public void setBarba(boolean barba){
    if (barba) {
        System.out.println("El pirata tiene barba");
    } else{
        System.out.println("El pirata no tiene barba");
    }
}
public boolean getBarba(){
    return barba;
}
public void setNombre(String nombre) {
    if (nombre != null && !nombre.equals("")) {
        this.nombre = nombre;
    } else {
        this.nombre = "Jack Sparrow";
    }
}
public String getNombre(){
    return nombre;
}
public void setOjo(boolean ojo){
    if (ojo) {
        System.out.println("El pirata tiene ambos ojos");
    } else{
        System.out.println("El pirata tiene un solo ojo y un parche");
    }
}
public boolean getOjo(){
    return ojo;
}
public void setPies(boolean pies){
    if (pies) {
        System.out.println("el pirata tiene 2 pies y puede correr");
    } else{
        System.out.println("el pirata tiene un pie y una pata de palo, no puede correr");
    }
}
public boolean getPies(){
    return pies;
}

//metos de accion
public String imprimir(){
    return getNombre();
}
}
