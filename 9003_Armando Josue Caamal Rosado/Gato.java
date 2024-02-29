public class Gato{
    private String nombre;
    private String raza;
    private int edad;
    private String estado;
    
    //constructor 
    public Gato(String nombre, String raza, int edad, String estado){
    }
    // metodos de acceso
    public void setNombre(String nombre){
        this.nombre =nombre.equals("")?"anuel": nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setRaza(String raza){
        this.raza=raza.equals("")?"persa": raza;
    }
    public String getRaza(){
        return raza;
    
    }
    public void setEdad(int edad){
        this.edad=(edad<0 || edad>15)? 5: edad;
    }
    public int getEdad (){
        return edad;
    }
    // acciones 
    public void setEstado (String estado){
        switch(estado){
            case "maullando": this.estado="maullando";
            break;
            case "comiendo": this.estado = "comiendo";
            break;
            case "durmiendo": this.estado="durmiendo";
            break;
            case "caminando": this.estado= "caminando";
            break;
            default: this.estado ="muerto";
            break;
        }
    }
    public String getEstado(){
        return estado;
    }
    public String mostrarName(){
        return nombre;
    }
    public String mostrarRaza(){
        return raza;
    }
    public int mostrarEdad(){
        return edad;
    }
    public String mostraEstado(){
        return estado;
    }
    public static void main(String[] args) {
        Gato m = new Gato("anuel", "persa", 3, "caminando");
        System.out.println(m.mostrarName());
        System.out.println(m.mostrarRaza());
        System.out.println(m.mostrarEdad());
        System.out.println(m.mostraEstado());
    }
}