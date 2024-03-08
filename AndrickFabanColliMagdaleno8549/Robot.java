public class Robot {
    
    private String nombre;
    private double altura;
    private double peso;
    private String color;

    
    public Robot(String nombre, double altura, double peso, String color) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.color = color;
    }

    
    public void correr() {
        System.out.println("El robot " + nombre + " esta corriendo.");
    }

    public void caminar() {
        System.out.println("El robot " + nombre + " esta caminando.");
    }

    public void barbusear() {
        System.out.println("El robot " + nombre + " esta barbuseando en un idioma raro.");
    }

    public void moverse() {
        System.out.println("El robot " + nombre + " se esta moviendo.");
    }

    public void dispararBomba() {
        System.out.println("El robot " + nombre + " esta disparando una bomba.");
    }

    public void recargarCañones() {
        System.out.println("El robot " + nombre + " esta recargando sus caniones.");
    }

    public void desprenderCabeza() {
        System.out.println("El robot " + nombre + " ha desprendido su cabeza.");
    }

    public void golpearEnemigo() {
        System.out.println("El robot " + nombre + " esta golpeando al enemigo.");
    }

    public void derrocheDeMinas() {
        System.out.println("El robot " + nombre + " esta realizando un derroche de minas.");
    }

    public void moverBrazos() {
        System.out.println("El robot " + nombre + " esta moviendo los brazos.");
    }

    public void parpadear() {
        System.out.println("El robot " + nombre + " esta parpadeando.");
    }
}
