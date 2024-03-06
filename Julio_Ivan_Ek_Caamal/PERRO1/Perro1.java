package PERRO1;
public class Perro1 {
    private String nombre;
    
    public Perro1(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public static void main(String[] args) {
        Perro1 p = new Perro1("rodolfo");
        p.setNombre("chapa");
        System.out.println(p.getNombre());
        
    }
}

////////////////prueba hecha cuando creamos un constructor se instancia en el main luego cuando instanciemos en el main 
// se pone de acuerdo con el constructor como aparece en perro 1 