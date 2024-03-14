public class Maestro {
    private String nombre;
    private String asignatura;
    private int anioservicio;
    private String grado; 
    public Maestro (String nombre, String asignatura, int anioservicio, String grado){
        setnombre(nombre);
        setasignatura(asignatura);
        setanioservicio(anioservicio);
        setgrado(grado);
    }

    public String getnombre() {
        return nombre;
    }
    
    public void setnombre (String nombre) {
        this.nombre = nombre;
    }
    
    public String getasignatura() {
        return asignatura;
    }

    public void setasignatura (String asignatura) {
        this.asignatura = asignatura;
    }
    
    public int getanioservicio() {
        return anioservicio;
    }
    
    public void setanioservicio (int anioservicio) {
        this.anioservicio = anioservicio;
    }

    public String getgrado() {
        return grado;
    }
    
    public void setgrado (String grado) {
        this.grado = grado;
    }

    public String verDatos(){
        return ("nombre: " + getnombre() + "\nasignatura: " + getasignatura() + "\nanios de servicio: " + getanioservicio() + "\ngrado: " + getgrado());
    }
}