import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void Producto(String[] args) throws IOException {
 Scanner scanner = new Scanner(System.in);
 int num1= scanner.nextInt();
 int num2= scanner.nextInt();
 
 
 int PROD= num1 * num2 ;
 
 System.out.printf("PROD = %d%n", PROD);
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
 
}