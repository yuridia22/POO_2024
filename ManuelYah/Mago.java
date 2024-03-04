public class Mago {
    private String nombre;
    private String elemento;
    private int nivel;
    private boolean tieneVarita;

    //constructor :v

    public Mago (String nombre, String elemento, int nivel, boolean tieneVarita){
        this.nombre = nombre.equals("")?"Magnus": nombre;
        this.elemento = elemento.equals("")?"fuego": elemento;
        this.nivel = nivel;
        this.tieneVarita = tieneVarita;
    }

    //sets

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("")?"Magnus": nombre;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento.equals("")?"fuego": elemento;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setTieneVarita(boolean tieneVarita) {
        this.tieneVarita = tieneVarita;
    }

    //gets

    public String getNombre() {
        return nombre;
    }

    public String getElemento() {
        return elemento;
    }

    public int getNivel() {
        return nivel;
    }

    public boolean isTieneVarita() {
        return tieneVarita;
    }

    //metodos

    public void obtenerVarita() {
    if (!tieneVarita) {tieneVarita = true;} else {}
}
    
    public void perderVarita() {
    if (tieneVarita) {tieneVarita = false;} else {}
}

     public void subirNivel(int cantidad) {this.nivel += cantidad;}

    public String hechizo(){
        if(isTieneVarita() == true){
           return getNombre() + " lanza un hechizo fuerte y efectivo";
        } 
        else{
            return getNombre()  + " Lanza un hechizo debil";
        }
    }

    public String mostrar(){
        return "Nombre: " + getNombre() + "  Elemento: " + getElemento() + "  Nivel " + getNivel() + "  Tiene varita? " + isTieneVarita();
    }

}