import java.util.Scanner;

public class Ejercicio8 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c, d, difference;
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    d = input.nextInt();
    difference = a * b - c * d;

    System.out.print("DIFERENCA = " + difference + "\n");
  }
}