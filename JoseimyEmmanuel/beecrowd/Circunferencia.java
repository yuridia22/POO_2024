import java.util.Scanner;
import java.text.DecimalFormat;

public class Circunferencia{
    

    public static void main(String args[]){
        double n = 3.14159;
        double a;
        DecimalFormat df = new DecimalFormat("0.0000");
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        a = Math.pow(r,2);
        a = a*n;
        System.out.println("A=" + df.format(a));

    }
 
}
