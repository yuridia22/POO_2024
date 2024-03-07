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
        System.out.println("El robot " + nombre + " está corriendo.");
    }

    public void caminar() {
        System.out.println("El robot " + nombre + " está caminando.");
    }

    public void barbusear() {
        System.out.println("El robot " + nombre + " está barbuseando en un idioma raro.");
    }

    public void moverse() {
        System.out.println("El robot " + nombre + " se está moviendo.");
    }

    public void dispararBomba() {
        System.out.println("El robot " + nombre + " está disparando una bomba.");
    }

    public void recargarCañones() {
        System.out.println("El robot " + nombre + " está recargando sus cañones.");
    }

    public void desprenderCabeza() {
        System.out.println("El robot " + nombre + " ha desprendido su cabeza.");
    }

    public void golpearEnemigo() {
        System.out.println("El robot " + nombre + " está golpeando al enemigo.");
    }

    public void derrocheDeMinas() {
        System.out.println("El robot " + nombre + " está realizando un derroche de minas.");
    }

    public void moverBrazos() {
        System.out.println("El robot " + nombre + " está moviendo los brazos.");
    }

    public void parpadear() {
        System.out.println("El robot " + nombre + " está parpadeando.");
    }
}
