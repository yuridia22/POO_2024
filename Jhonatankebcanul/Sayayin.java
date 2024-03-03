public class Sayayin {
    private String nombre;
    private int poder;
    private String pelo;
    private String raza;
    private String cola;

    public Sayayin(String nombre, int poder, String pelo, String raza, boolean cola) {
        this.nombre = nombre;
        this.poder = poder;
        this.raza = raza;
        this.pelo = pelo;
        this.cola = cola ? "moviendo" : "quieta"; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public void setCola(boolean cola) {
        this.cola = cola ? "moviendo" : "quieta";
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public String getRaza() {
        return raza;
    }

    public String getPelo() {
        return pelo;
    }

    public String getCola() {
        return cola;
    }

    public void estado() {
        System.out.println(nombre + " es de raza " + raza + ", el poder es " + poder + ", la cola está " + cola + ", su cabello es " + pelo);
        setCola(true);
    }

    
}

   