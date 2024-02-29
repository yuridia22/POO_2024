public class Gato{
    private String nombre;
    private String raza;
    private int edad;
    private String estado;

    public Gato (String nombre, String raza, int edad, String estado){
        setNombre(nombre);
        setRaza(raza);
        setEdad(edad);
        setEstado(estado);
    }
    public void setNombre(String nombre){
        this.nombre = nombre.equals(" ") ? "ozuna" : nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setRaza(String raza){
        this.raza = raza.equals(" ") ? "sianes" : raza;
    }
    public String getRaza(){
        return raza;
    }
    public void setEdad(int edad){
        this.edad = (edad < 0 || edad > 20) ? 5 : edad;
    }
    public int getEdad(){
        return edad;
    }
    //1: caminando, 2:comiendo, 3: durmiendo 
    public void setEstado(String estado){
        switch (estado) {
            case "caminando":this.estado = "caminando"; 
                break;
            case "comiendo":this.estado = "comiendo"; 
                break;
            case "durmiendo": this.estado = "durmiendo";
                break;
            case "maullando":this.estado = "miau miau";
                break;
            default: this.estado = "muerto"; 
                break;
        }
    }
    public String getEstado(){
        return estado;
    }
    public String mostrarNom(){
        return nombre;
    }
    public String mostraraza(){
        return raza;
    }
    public int mostrarEd(){
        return edad;
    }
    public String mostraEst(){
        return estado;
    }
    public static void main(String[] args) {
        Gato m = new Gato("ozuna", "sianes", 3, "caminando");
        System.out.println(m.mostrarNom());
        System.out.println(m.mostraraza());
        System.out.println(m.mostrarEd());
        System.out.println(m.mostraEst());
    }
}