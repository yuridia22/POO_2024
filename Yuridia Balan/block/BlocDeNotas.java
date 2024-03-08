public class BlocDeNotas {
    private Nota[] notas;
    private int numNotas;
    private int capacidad;

    public BlocDeNotas(int capacidad) {
        notas = new Nota[capacidad];
        setCapacidad();
        numNotas = 2;
        notas[0] = new Nota("URGENTE","07/03/2024", "23/03/2024", "Realizar mi tarea de programación");
        notas[1] = new Nota("URGENTE","07/03/2024", "25/03/2024", "Hacer un ensayo");
    }

    public int getCapacidad() {
        return capacidad;
    }

    private void setCapacidad() {
        this.capacidad = notas.length;
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
            System.out.println("No hay notas en el bloc de notas.");
        }
        else {
            System.out.println("Notas en el bloc de notas:");
            for (int i = 0; i < numNotas; i++) {
                System.out.println("______________________________________________________\nNota " + (i + 1) + ":");
                System.out.println(notas[i]);
            }
        }
    }

    public void eliminarNotas() {
        notas = new Nota[capacidad];
        numNotas = 0;
        System.out.println("Todas las notas han sido eliminadas.");
    }

    public void actualizarNota(int numN, Nota n) {
        if (numN >= 0 && numN < numNotas) {
            notas[numN] = n;
            System.out.println("_______________________________________________________\nLa nota en el número " + numN + " ha sido actualizada correctamente.\n_______________________________________________________");
        }
        else {
            System.out.println("El índice especificado no es válido.");
        }
    }
}
