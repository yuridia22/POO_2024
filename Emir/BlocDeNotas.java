public class BlocDeNotas {
    private Nota[] notas;
    private int numNotas;
    private int capacidad;
    private Color c;

    public BlocDeNotas(int capacidad) {
        notas = new Nota[capacidad];
        setCapacidad();
        numNotas = 3;
        notas[0] = new Nota("03/03/2024", "Realizar mi tarea de programación", "04/03/2024");
        notas[1] = new Nota("05/03/2024", "Hacer un ensayo", "06/03/2024");
        notas[2] = new Nota("12/03/2024", "Debatir con Santiago a cerca de la inexistencia del racismo inverso", "12/03/2024");
        c = new Color("morado");
    }

    public int getCapacidad() {
        return capacidad;
    }

    private void setCapacidad() {
        this.capacidad = notas.length;
    }

    public Color getColor() {
        return c;
    }

    public void setColor(String color) {
        this.c.setColor(color);
    }

    public void agregarNota(Nota nota) {
        if (numNotas < capacidad) {
            notas[numNotas] = nota;
            numNotas++;
        }
        else {
            System.out.println("No se puede agregar más notas. Capacidad máxima alcanzada.");
        }
    }

    public void mostrarNotas() {
        if (numNotas == 0) {
            System.out.println(c.getColorANSI() + "No hay notas en el bloc de notas.");
        }
        else {
            System.out.println(c.getColorANSI() + "Notas en el bloc de notas:");
            for (int i = 0; i < numNotas; i++) {
                System.out.println(c.getColorANSI() + "______________________________________________________\nNota " + (i + 1) + ":");
                System.out.println(notas[i]);
            }
        }
    }

    public void eliminarNotas() {
        notas = new Nota[capacidad];
        numNotas = 0;
        System.out.println(c.getColorANSI() + "Todas las notas han sido eliminadas.");
    }

    public void actualizarNota(int numN, Nota n) {
        if (numN >= 0 && numN < numNotas) {
            notas[numN] = n;
            System.out.println(c.getColorANSI() + "_______________________________________________________\nLa nota en el número " + numN + " ha sido actualizada correctamente.\n_______________________________________________________");
        }
        else {
            System.out.println(c.getColorANSI() + "El índice especificado no es válido.");
        }
    }
}
