package Jimmy.clases;

import Jimmy.clases.*;

public class Main {
  public static void main(String[] args) {
    Habilidad hab1 = new Habilidad("Hielo", "Permite hacer hechizos de hielo");
    Mago mago = new Mago("Vadas", "Masculino", hab1);

    System.out.println(mago.getHabilidad().getNombre());
    System.out.println(mago.getHabilidad().getDescripcion());
  }
}
