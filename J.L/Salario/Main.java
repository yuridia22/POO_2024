import java.io.IOException;
 
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int empleado = s.nextInt();
		int horas = s.nextInt();
		double pago = s.nextDouble();
		double salario = horas*pago;

		System.out.printf("NUMBER = %d%n", empleado);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        s.close();
	}
}