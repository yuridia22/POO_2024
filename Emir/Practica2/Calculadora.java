package Practica2;

public class Calculadora {
    
    public int Suma(int a, int b){
        return a + b; 
    }

    public double Suma(double a, double b){
        return a + b; 
    }

    public int Resta(int a, int b){
        return a - b; 
    }

    public double Resta(double a, double b){
        return a - b; 
    }

    public int Mult(int a, int b){
        return a * b; 
    }

    public double Mult(double a, double b){
        return a * b; 
    }

    public int Div(int a, int b){
        if (b==0) {
            System.out.println("EL valor de b debe ser diferente de 0, ya que no se puede dividir entre 0");
        }
        else if (a==0 && b==0) {
            System.out.println("EL valor de a y b debe ser diferente de 0, ya que no se puede dividir 0 entre 0");
        }
        return a / b;
    }

    public double Div(double a, double b){
        if (b==0) {
            System.out.println("EL valor de b debe ser diferente de 0, ya que no se puede dividir entre 0");
        }
        else if (a==0 && b==0) {
            System.out.println("EL valor de a y b debe ser diferente de 0, ya que no se puede dividir entre 0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("Suma enteros: " + c.Suma(4, 4));
        System.out.println("Suma decimales: " + c.Suma(9.3, 2));
        System.out.println("Resta enteros: " + c.Resta(8, 4));
        System.out.println("Resta decimales: " + c.Resta(5, 2.1));
        System.out.println("Multiplicación enteros: " + c.Mult(4, 4));
        System.out.println("Multiplicaión decimales: " + c.Mult(9.3, 2));
        System.out.println("División enteros: " + c.Div(99, 12));
        System.out.println("División decimales: " + c.Div(256.4, 2));
    }
}
