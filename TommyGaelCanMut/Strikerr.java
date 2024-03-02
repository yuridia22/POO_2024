public class Strikerr{
    private String nombre;
    private String tamaño;
    private int edad;
    private boolean pelea;

    public Strikerr(String nombre, String tamaño, int edad, boolean pelea){
        this.setNombre(nombre);
        this.setTamaño(tamaño);
        this.setEdad(edad);
        this.setPelea(pelea);

    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setPelea(boolean pelea){
        this.pelea = pelea;
    }


    public String getNombre(){
        return nombre;
    }
    public String getTamaño(){
        return tamaño;
    }
    public int getEdad(){
        return edad;
    }
    public boolean getPelea(){
        return pelea;
    }

    public void pelea(){
        if(!pelea){
            pelea = true;
            System.out.println(" el es "+nombre+" y es "+tamaño+", pelea y "+"tambien tiene "+edad+" de edad ");
        } else{
            pelea = false;
            System.out.println(nombre+"a veces no pelea");
        }
    }

}