
import java.util.Scanner;

public class Promedio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double promedio = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f\n", promedio);

    }
}
