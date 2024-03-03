public class Gato {
    private String nombre;
    private int edad;
    private String raza;

    public Gato(String nombre,int edad, String raza) {
        setNombre(nombre);
        setEdad(edad);
        setRaza(raza);
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre.equals(" "))? "Michi": nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setRaza(String raza) {
        this.raza = (raza.equals(" "))? "Angora": raza;
    }

    public String getRaza() {
        return raza;
    }

    public String mostrarN(){
        return getNombre();
    }

    public static void main(String[] args) {
        Gato g= new Gato("Michiberto",3,"malish");
        g.setNombre("Garfield");
        g.setEdad(1);
        g.setRaza("Angora");
        System.out.println("Nombre: " + g.mostrarN());
        System.out.println("Edad: " + g.getEdad());
        System.out.println("Raza: " + g.getRaza());
    }
}
