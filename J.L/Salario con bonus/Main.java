import java.io.IOException;
 
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String nombre = s.next();
		double salario = s.nextDouble();
		double totalvendido = s.nextDouble();
		double comision = totalvendido*0.15;
		double total = salario+comision;
		System.out.printf("TOTAL = R$ %.2f%n", total);
		s.close();
	}
}