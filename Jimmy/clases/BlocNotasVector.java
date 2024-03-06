package Jimmy.clases;

import java.util.Vector;

public class BlocNotasVector {
  private int nnotas;
  private Vector<Nota> notas;

  public BlocNotasVector() {
    nnotas = 0;
    notas = new Vector<Nota>();
  }

  public boolean addNota(Nota nota) {
    notas.add(nota);
    nnotas++;
    return true;
  }

  public void getNota(int num) {
    if (!notas.isEmpty() && nnotas > num) {
      notas.get(num).imprimir(100);
    }
  }

  public boolean deleteNota(int num) {
    if (!notas.isEmpty() && nnotas > num) {
      notas.remove(num);
      nnotas--;
      return true;
    } else {
      return false;
    }
  }

  public boolean updateNota(int num, Nota n) {
    if (!notas.isEmpty() && nnotas > num) {
      notas.set(num, n);
      return true;
    }
    return false;
  }

  public boolean updateNota(int num, String texto, String tipo, String autor, String fechalimite, String color) {
    if (!notas.isEmpty() && nnotas > num) {
      if (!texto.isEmpty()) {
        notas.get(num).setAutor(autor);
      }
      if (!texto.isEmpty()) {
        notas.get(num).setTipo(tipo);
        ;
      }
      if (!texto.isEmpty()) {
        notas.get(num).setTexto(texto);
        ;
      }
      if (!texto.isEmpty()) {
        notas.get(num).setFechaLimite(fechalimite);
        ;
      }
    }
    return false;
  }
}