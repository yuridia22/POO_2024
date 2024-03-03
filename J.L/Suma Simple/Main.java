import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int A= s.nextInt(); 
        int B= s.nextInt();
        int SOMA= A+B;
        
        System.out.println("SOMA = "+SOMA);
        
        s.close();
    }
 
}