package Jimmy.clases;

public class BlocNotas {
  private Nota[] notas;
  private int cantidadNotas;

  public BlocNotas(int capacidadMaxima) {
    notas = new Nota[capacidadMaxima];
    cantidadNotas = 0;
  }

  public void agregarNota(Nota nota) {
    if (cantidadNotas < notas.length) {
      notas[cantidadNotas] = nota;
      cantidadNotas++;
      System.out.println("Nota agregada correctamente.");
    } else {
      System.out.println("No se puede agregar más notas. Capacidad máxima alcanzada.");
    }
  }

  public void mostrarNota(int id, int tamanio) {
    if (id >= 0 && id < cantidadNotas && notas[id] != null) {
      notas[id].imprimir(tamanio);
    } else {
      System.out.println("La nota especificada no existe.");
    }
  }

  public void mostrarNotas(int tamanio) {
    for (int i = 0; i < cantidadNotas; i++) {
      notas[i].imprimir(tamanio);
    }
  }

  public void actualizarNota(Nota nota, int id) {
    if (id >= 0 && id < cantidadNotas && notas[id] != null) {
      notas[id].setAutor(nota.getAutor());
      notas[id].setTipo(nota.getTipo());
      notas[id].setTexto(nota.getTexto());
      notas[id].setFechaLimite(nota.getFechaLimite());
    }
  }

  public void eliminarNota(int id) {
    if (id >= 0 && id < cantidadNotas && notas[id] != null) {
      notas[id] = null;
      System.out.println("Nota eliminada correctamente.");
    } else {
      System.out.println("La nota especificada no existe.");
    }
  }
}
