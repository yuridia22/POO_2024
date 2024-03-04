public class Gato {
    private String name;
    private String color;
    private String raza;
    private int estado;
    private int edad;

    public Gato(String name, String color, int estado, int edad, String raza) {
        setName(name);
        setColor(color);
        setEstado(estado);
        setRaza(raza);
        setEdad(edad);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEdad(int edad) {
        if(edad > 0 && edad <=20) {
            this.edad = edad;
        }
    }
    public int getEdad() {
        return edad;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    public int getEstado() {
        return estado;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }

    public String comer() {
        return "el gato esta comiendo";
    }

    public String maullar() {
        return "miau miau";
    }

    public String dormir() {
        return "el gato esta durmiedo";
    }

}
