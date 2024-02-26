package DanaChin.Beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class SumaSimple {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int Somo = A + B;
        System.out.println("SOMA = " + Somo);
    }
}
