public class Maestro {
    private String Nombre;
    private String Asignatura;
    private int Anioservicio;
    private String Grado; 
    public Maestro (String Nombre, String Asignatura, int Anioservicio, String Grado){
        setNombre(Nombre);
        setAsignatura(Asignatura);
        setAnioservicio(Anioservicio);
        setGrado(Grado);
    }

    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre (String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura (String Asignatura) {
        this.Asignatura = Asignatura;
    }
    
    public int getAnioservicio() {
        return Anioservicio;
    }
    
    public void setAnioservicio (int Anioservicio) {
        this.Anioservicio = Anioservicio;
    }

    public String getGrado() {
        return Grado;
    }
    
    public void setGrado (String Grado) {
        this.Grado = Grado;
    }

    public String verDatos(){
        return ("Nombre: " + getNombre() + "\nAsignatura: " + getAsignatura() + "\nAños de servicio: " + getAnioservicio() + "\nGrado: " + getGrado());
    }

}
