
import java.util.Scanner;

public class SomaBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
        sc.close();

    }
}
