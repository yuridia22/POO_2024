public class Policia {
    private String nombre;
    private int edad;
    private boolean genero;
    private String rango;

    public Policia(String nombre,int edad,boolean genero, String rango){
        setEdad();
        setNombre();
        setRaza();
        setRango();
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombrea(String nombre){
        this.nombre = (nombre.equals(" "))? "Señor Justicia": nombre,

    }
    
}
