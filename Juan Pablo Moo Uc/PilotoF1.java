public class PilotoF1 {

    private double altura;
    private float peso;
    private String nombre;
    private String equipo;
    private int nocoche;
    private String nacionalidad;

    public PilotoF1(String nacionalidad) {
        setNacionalidad(nacionalidad);
        altura = 1.73;
        peso = 64;
        nombre = "Checo Perez";
        equipo = "Red Bull";
        nocoche = 11;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getNocoche() {
        return nocoche;
    }

    public void setNocoche(int coche) {
        this.nocoche = coche;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
