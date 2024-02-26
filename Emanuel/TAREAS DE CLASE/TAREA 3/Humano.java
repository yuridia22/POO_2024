public class Humano {
    private String nombre;
    private int edad;
    private String genero;
    private String ocupacion;
    private String nacionalidad;

    public Humano(String nombre, int edad, String genero, String ocupacion, String nacionalidad) {
        this.nombre = (nombre != " ") ? nombre : "Fin el humano";
        this.edad = edad;
        this.genero = genero;
        this.ocupacion = ocupacion;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void hablar(String accion) {
        System.out.println(nombre + " está hablando sobre: " + accion);
    }

    public void caminar() {
        System.out.println(nombre + " está caminando.");
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando como " + ocupacion + ".");
    }

    public void respirar() {
        System.out.println(nombre + " está respirando.");
    }
}