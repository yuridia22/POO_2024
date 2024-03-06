import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmpleado = sc.nextInt();
        int horas = sc.nextInt();
        double monto = sc.nextDouble();
        double total = horas * monto;
        System.out.println("NUMBER = " + numEmpleado);
        System.out.printf("SALARY = U$ %.2f\n", total);
    }

}
