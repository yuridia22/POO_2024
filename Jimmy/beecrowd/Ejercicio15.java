import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    double a, b;

    Scanner sc = new Scanner(System.in);
    a = sc.nextDouble();
    b = sc.nextDouble();

    System.out.printf("%.3f km/l\n", a / b);
  }
}