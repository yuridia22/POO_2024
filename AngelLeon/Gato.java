public class Gato {
    private String nombre;
    private String[] coloresDisponibles = {"Blanco", "Negro", "Gris", "Naranja"};
    private int edadMeses;
    private boolean estaVivo;

    // Constructor
    public Gato(String nombre, String color, int edadMeses, boolean estaVivo) {
        this.nombre = (nombre != null && !nombre.isEmpty()) ? nombre : "Capuchino";
        this.edadMeses = (edadMeses >= 0) ? edadMeses : 0;
        this.estaVivo = estaVivo;
        setColor(color);
    }

    // Sets
    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.isEmpty()) ? nombre : "Capuchino";
    }

    public void setColor(String color) {
        boolean colorValido = false;
        for (String col : coloresDisponibles) {
            if (col.equalsIgnoreCase(color)) {
                colorValido = true;
                break;
            }
        }
        if (colorValido) {
            this.coloresDisponibles[0] = color;
        } else {
            System.out.println("Color no válido. Se asignará el color por defecto.");
            this.coloresDisponibles[0] = "Blanco"; // Cambiado a blanco como solicitado
        }
    }

    public void setEdadMeses(int edadMeses) {
        this.edadMeses = (edadMeses >= 0) ? edadMeses : 0;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    // Gets
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return coloresDisponibles[0];
    }

    public int getEdadMeses() {
        return edadMeses;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    // Métodos
    public void morir() {
        if (estaVivo) {
            estaVivo = false;
        }
    }

    public void crecerEdad(int cantidad) {
        edadMeses += cantidad;
    }

    public String maullar() {
        if (estaVivo) {
            return nombre + ": MIAU MIAU";
        } else {
            return nombre + " está muerto, no puede maullar";
        }
    }

    public String comer() {
        if (estaVivo) {
            return nombre + ": Está comiendo ñom ñom";
        } else {
            return nombre + " está muerto, no puede comer";
        }
    }

    public String dormir() {
        if (estaVivo) {
            return nombre + ": Está durmiendo";
        } else {
            return nombre + " está muerto, ya lleva durmiendo desde hace días y no despierta";
        }
    }

    public String limpiarse() {
        if (estaVivo) {
            return nombre + ": Se está limpiando su pelo";
        } else {
            return nombre + " no puede limpiarse solo, está muerto";
        }
    }

    public String saltar() {
        if (estaVivo) {
            return nombre + ": Da un salto y se sube en algo";
        } else {
            return nombre + " está muerto, no puede saltar";
        }
    }

    public String mostrar() {
        return "Nombre: " + nombre + ", Color: " + coloresDisponibles[0] + ", Edad en meses: " + edadMeses + " meses, Estado: " + (estaVivo ? "vivo" : "muerto");
    }
}
