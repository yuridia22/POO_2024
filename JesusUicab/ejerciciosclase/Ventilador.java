
package ejerciciosclase;

public class Ventilador {
    private String marca;
    private String color;
    private boolean estado;
    private int velocidad;

    public Ventilador(String marca, String color) {
        setMarca(marca);
        setColor(color);
        setEstado(true);
        setVelocidad(1);
    }

    public void setMarca(String marca) {
        this.marca = (marca.equals(" ")) ? "MAN" : marca;
    }

    public void setColor(String color) {
        this.color = (color.equals("")) ? "Gray" : color;
    }

    public void setEstado(boolean estado) {
        this.estado = (estado) ? true : estado;
    }

    public void setVelocidad(int velocidad) {
        if (getEstado() == true) {
            this.velocidad = (velocidad <= 0 || velocidad >= 4) ? 1 : velocidad;
        } else if (getEstado() == false) {
            this.velocidad = 0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public boolean getEstado() {
        return estado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void encender() {
        estado = true;
        velocidad = 1;
    }

    public void cambiarVelocidad(int velocidad) {
        setVelocidad(velocidad);
    }

    public void apagar() {
        estado = false;
        velocidad = 0;
    }

    public String mostrarMarca() {
        return getMarca();
    }

    public String mostrarColor() {
        return getColor();
    }

    public int mostrarVelocidad() {
        return getVelocidad();
    }

    public boolean mostrarEstado() {
        return getEstado();
    }

}