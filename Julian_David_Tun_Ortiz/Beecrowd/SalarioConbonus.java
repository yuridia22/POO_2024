
import java.util.Scanner;

public class SalarioConbonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        double sf = sc.nextDouble();
        double ventas = sc.nextDouble();
        double total = ((ventas * 15) / 100) + sf;
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
