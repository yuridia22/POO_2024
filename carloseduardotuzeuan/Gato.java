public class Gato {
    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private String estado;

    // Constructor
    public Gato(String nombre, String raza, int edad, String estado, String color) {
        setNombre(nombre);
        setRaza(raza);
        setEdad(edad);
        setEstado(estado);
        setColor(color);
    }

    // Métodos de acceso
    public void setNombre(String nombre) {
        this.nombre = (nombre.equals("")) ? "Wilzon" : nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setRaza(String raza) {
        this.raza = (raza.equals("")) ? "Munchkin" : raza;
    }
    public String getRaza() {
        return raza;
    }
    public void setEdad(int edad) {
        this.edad = (edad < 0 || edad > 22) ? 5 : edad;
    }
    public int getEdad() {
        return edad;
    }
    // 1: caminando, 2:comiendo, 3: durmiendo
    public void setEstado(String estado) {
        switch (estado) {
            case "caminando":this.estado = "caminando";break;
            case "comiendo":this.estado = "estoy comiendo miau";break;
            case "durmiendo":this.estado = "durmiendo zzzzzz";break;
            case "maullando":this.estado = "miau miau";break;
            default:
                this.estado = "muerto";
                break;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setColor(String color) {
        this.color = (color.equals("")) ? "naranja" : color;
    }

    public String getColor() {
        return color;
    }
    public String mostrarNombre(){
        return nombre;
    }
    public String razagato(){
        return raza;
    }
    public int mostrarEdad() {
        return edad;
    }
    public String mostarEstado(){
        return estado;
    }
    public String mostrarColor() {
        return getColor();
    }
    public static void main(String[] args) {
        Gato m = new Gato("", "", 0, "", "");
        System.out.println(m.mostrarColor());
 
    }
}



    
