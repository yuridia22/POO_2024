public class Perro {
    private String nombre;
    private String raza;
    private double edad;
    private double altura;
    private double peso;
    private int estado;

    public Perro(String nombre, String raza, double edad, double altura, double peso) {
        setNombre(nombre);
        setRaza(raza);
        setEdad(edad);
        setAltura(altura);
        setPeso(peso);
        this.estado = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.isEmpty()) ? nombre : "Chucho";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = (raza != null && !raza.isEmpty()) ? raza : "Gran Danés";
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstado() {
        return estado;
    }

    private void changeEstado(int valor) {
        this.estado = (this.estado > 0) ? valor : 0;
    }

    public void ladrar() {
        if (getEstado() > 0) {
            System.out.println("Guau, guau, guau, guau, guau");
        } else {
            System.out.println("Estoy con diosito");
        }
    }

    public void oir(String instruccion) {
        switch (instruccion) {
            case "ladrar":
                ladrar();
                break;
            case "morder":
                morder();
                break;
            case "comer":
                saltar();
                comer("panucho");
                break;
            default:
                System.out.println("Instrucción no válida");
        }
    }

    public void morder() {
        System.out.println("usdhuisdaoj hsidhsihdao ishcojsoda");
    }

    public void saltar() {
        System.out.println("Estoy saltando");
    }

    public void comer(String comida) {
        System.out.println("Que rico " + comida);
    }

    private void changeEstado(int valor) {
        // Cambia el estado solo si el perro está vivo (estado > 0)
        this.estado = (this.estado > 0) ? valor : 0;
    }

    public void morir() {
        System.out.println("Adios mundo cruel");
        changeEstado(0);  // Cambia el estado a 0 (muerto) al morir
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro("Panchito", "Maltes", 4, 1, 7.4);
        System.out.println(miPerro.getNombre());
        System.out.println(miPerro.getRaza());
        System.out.println(miPerro.getEdad() + " años");
        System.out.println(miPerro.getAltura() + " m");
        System.out.println(miPerro.getPeso() + " kg");
        miPerro.ladrar();
        miPerro.oir("comer");
    }
}
