package Trabjaos;

public class Avatar {
    private String nombre;
    private int edad;
    private double peso;
    private String poder;
    private int flechas;
    private String comida;
    private boolean arco;

    public Avatar(String nombre, int edad, double peso, String poder, int flechas) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.poder = poder;
        this.flechas = flechas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public boolean getArco() {
        return arco;
    }

    public void setArco(boolean arco) {
        this.arco = arco;

    }

    public void correr() {
        System.out.println(nombre + "esta corriendo ahora");

    }

    public void caminar() {
        System.out.println(nombre + "esta caminando ahora");

    }

    public void disparar() {
        if (arco == true) {
            if (flechas <= 0) {
                System.out.println(nombre + " no tiene flechas para disparar");
                return;
            } else {
                System.out.println("Numero de flechas: " + flechas);
                System.out.println(nombre + " acaba de disparar una flecha");
                flechas = flechas - 1;
                System.out.println("flechas: " + flechas);

            }

        } else {
            System.out.println("necesitas un arco para disparar");
        }

    }

    public void huir() {
        System.out.println(nombre + " Se dio a la fuga");

    }

    public void comer() {
        System.out.println(nombre + " esta alimentandoze de un rico: " + this.comida);

    }

    public void acribillar() {
        if (arco == true) {
            if (flechas <= 0) {
                System.out.println("No puedes acribillar porque necesitas flechas");
                return;
            } else {
                System.out.println(nombre + " Esta acribillando a lo loco");
                while (flechas > 0) {

                    System.out.println("Disparaste; flechas: " + flechas);
                    flechas = flechas - 1;

                }
                System.out.println(nombre + " Se quedo sin flechas");

            }

        } else {
            System.out.println("Necesitas un aro para disparar");
        }

    }

}
