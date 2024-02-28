import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

  public static void main(String[] args) throws IOException {
    int a = 10, b = 9, x;
    Scanner teclado = new Scanner(System.in);
    a = teclado.nextInt();
    b = teclado.nextInt();
    x = a + b;

    System.out.println("X = " + x);
  }

}