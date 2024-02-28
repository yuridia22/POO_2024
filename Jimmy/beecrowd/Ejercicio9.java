import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = input.nextInt();
    int horas = input.nextInt();
    double valorHora = input.nextDouble();
    double salario = horas * valorHora;

    System.out.println("NUMBER = " + numero);
    System.out.printf("SALARY = U$ %.2f", salario);
    System.out.println();
  }
}