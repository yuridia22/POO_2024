import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) throws IOException {
    double a, b, c, media;
    Scanner teclado = new Scanner(System.in);
    a = teclado.nextDouble();
    b = teclado.nextDouble();
    c = teclado.nextDouble();

    media = (((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10);

    System.out.printf("MEDIA = %.1f\n", media);
  }
}