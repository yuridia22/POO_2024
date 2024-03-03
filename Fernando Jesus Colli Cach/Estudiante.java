public class Estudiante {
    private String nombre;
    private int edad;
    private String genero;
    private String uniforme;
    private boolean zapatos;

    public Estudiante(String nombre, int edad, String genero, String uniforme, boolean zapatos) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.uniforme = uniforme;
        this.zapatos = zapatos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setUniforme(String uniforme) {
        this.uniforme = uniforme;
    }

    public String getUniforme() {
        return uniforme;
    }

    public void setZapatos(boolean zapatos) {
        this.zapatos = zapatos;
    }

    public boolean tieneZapatos() {
        return zapatos;
    }

    public static void main(String[] args) {
        Estudiante miEstudiante = new Estudiante("Juan", 17, "Masculino", "Uniforme", true);
        System.out.println("Nombre: " + miEstudiante.getNombre());
        System.out.println("Edad: " + miEstudiante.getEdad());
        System.out.println("Género: " + miEstudiante.getGenero());
        System.out.println("Uniforme: " + miEstudiante.getUniforme());
        System.out.println("Zapatos: " + miEstudiante.tieneZapatos());
    }
}