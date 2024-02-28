package DanaChin.Beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class ProductoSimple {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int prod = A * B;
        System.out.println("PROD = " + prod);
    }
}