import java.io.IOException;
import java.util.Scanner;

public class Ejercicio20 {

  public static void main(String[] args) throws IOException {
    Scanner lector = new Scanner(System.in);
    int duracionSegundos = lector.nextInt();
    int horas = duracionSegundos / 3600;
    duracionSegundos -= horas * 3600;
    int minutos = duracionSegundos / 60;
    duracionSegundos -= minutos * 60;
    int segundos = duracionSegundos;
    System.out.println(horas + ":" + minutos + ":" + segundos);
  }
}
