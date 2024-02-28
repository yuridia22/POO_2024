import java.io.IOException;
import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) throws IOException {
    Scanner t = new Scanner(System.in);
    int A = t.nextInt();
    System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", A / 365, (A % 365) / 30, (A % 365) % 30);
  }
}