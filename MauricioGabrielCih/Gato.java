public class Gato {

    private String nombre;
    private String raza;
    private String color;
    private int patas;
    private int edad;
    private String estado;

    public Gato(String nombre, String raza, String color, int edad, int patas) {
        this.setNombre(nombre);
        this.setRaza(raza);
        this.setColor(color);
        this.setPatas(patas);
        this.setEdad(edad);
        this.setEstado("durmiendo");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public int getPatas() {
        return patas;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public void correr() {
        System.out.println(nombre + " es de raza " + raza + ", de color " + color + " ,de " + edad + " meses de edad y" +  " esta corriendo" + " con sus " + patas +" patas");
        setEstado("corriendo");
    }
    public void caminar() {
        System.out.println(nombre + " es de raza " + raza + ",de color " + color + " ,de " + edad + " meses de edad y" +  " esta caminando" + " con sus " + patas +" patas");
        setEstado("caminando");
    }

    public void acostarse() {
        System.out.println(nombre + " es de raza " + raza + ",de color " + color + ", de " + edad + " meses de edad y" +  " esta acostado");
        setEstado("acostado");
    }

}
