import java.util.List;
import java.util.ArrayList;


public class Biblioteca {
    private List<Libro> librosResguardados;
    private List<Revista> revistasResguardadas;

    public Biblioteca() {
        librosResguardados = new ArrayList<>(); 
        revistasResguardadas = new ArrayList<>(); 
    }

    public void prestarLibro(Libro libro) {
        
    }

    public void devolverLibro(Libro libro) {
        
    }

    public void prestarRevista(Revista revista) {
        
    }

    public void devolverRevista(Revista revista) {
        
    }
}


class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String carrera;
    private String estado;

    public boolean consultarDisponibilidad() {
        
        return true; 
    }

    public void solicitarReparacion() {
        
    }
}


class Revista {
    private String titulo;
    private String editor;
    private int añoPublicacion;
    private int numero;
    private String carrera;
    private String estado;

    public boolean consultarDisponibilidad() {
        
        return true; 
    }

    public void solicitarReparacion() {
        
    }
}


class Bibliotecario {
    private String nombre;
    private String apellido;
    private String puesto;

    public void registrarPrestamo() {
        
    }

    public void registrarDevolucion() {
        
    }

    public void realizarReparacion() {
        
    }

    public void generarReporte() {
        
    }
}
