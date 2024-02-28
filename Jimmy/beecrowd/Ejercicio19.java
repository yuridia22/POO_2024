import java.io.IOException;
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) throws IOException {
    Scanner lector = new Scanner(System.in);
    int notasIngresadas = lector.nextInt();
    int actual = notasIngresadas;
    int billetes100 = actual / 100;
    actual -= billetes100 * 100;
    int billetes50 = actual / 50;
    actual -= billetes50 * 50;
    int billetes20 = actual / 20;
    actual -= billetes20 * 20;
    int billetes10 = actual / 10;
    actual -= billetes10 * 10;
    int billetes5 = actual / 5;
    actual -= billetes5 * 5;
    int billetes2 = actual / 2;
    actual -= billetes2 * 2;
    int billetes1 = actual;

    System.out.println(notasIngresadas);
    System.out.println(billetes100 + " nota(s) de R$ 100,00");
    System.out.println(billetes50 + " nota(s) de R$ 50,00");
    System.out.println(billetes20 + " nota(s) de R$ 20,00");
    System.out.println(billetes10 + " nota(s) de R$ 10,00");
    System.out.println(billetes5 + " nota(s) de R$ 5,00");
    System.out.println(billetes2 + " nota(s) de R$ 2,00");
    System.out.println(billetes1 + " nota(s) de R$ 1,00");
  }
}
