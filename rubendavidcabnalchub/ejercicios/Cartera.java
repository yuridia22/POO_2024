public class Cartera {
    private String color;
    private int tamanio;
    private String marca;
    private boolean abierta;
    private boolean guardandoCosas;
    private boolean sacandoCosas;
    
    public Cartera() {
        this.color = "negro";
        this.tamanio = 17;
        this.marca = "Miniso";
        this.abierta = false;
        this.guardandoCosas = false;
        this.sacandoCosas = false;
    }

    // Métodos
    public void abrir() {
        if (!abierta) {
            abierta = true;
            System.out.println("La cartera se ha abierto.");
        } else {
            System.out.println("La cartera ya estaba abierta.");
        }
    }

    public void cerrar() {
        if (abierta) {
            abierta = false;
            System.out.println("La cartera se ha cerrado.");
        } else {
            System.out.println("La cartera ya estaba cerrada.");
        }
    }

    public void guardarCosas() {
        if (abierta && !guardandoCosas) {
            guardandoCosas = true;
            System.out.println("Estás guardando cosas en la cartera.");
        } else {
            System.out.println("No puedes guardar cosas en la cartera.");
        }
    }

    public void sacarCosas() {
        if (abierta && !sacandoCosas) {
            sacandoCosas = true;
            System.out.println("Estás sacando cosas de la cartera.");
        } else {
            System.out.println("No puedes sacar cosas de la cartera.");
        }
    }
    
}
