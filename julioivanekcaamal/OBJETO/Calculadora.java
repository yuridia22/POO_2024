package julioivanekcaamal.OBJETO;

import java.util.Scanner;


public class Calculadora {
    ///////////////////////////////atributos
    
    private String nombre;
    private String modelo;
    private double precio;
    private String color;
    private double peso;
    private String marca;
    private String tamaño;
    private String tipo; 
    ///////////////////////////////constructor
    public Calculadora(String nombre, String modelo, double precio, String color, double peso, String marca, String tamaño, String tipo){
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.marca = marca;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }
    //////////////////////////////metodos de acceso
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getTamaño(){
        return tamaño;
    }
    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    
    /////////////////////////////metodos
    public void encender(){
        System.out.println("Calculadora encendida");
    }
    public void apagar(){
        System.out.println("CASIO....");
    }
    public void sumar(){
        Scanner s = new Scanner(System.in);
        System.out.println("_____________SUMA____________");
        System.out.print("ingrese los numeros = ");
        int a = s.nextInt(); 
        System.out.print(" + ");
        int b = s.nextInt();
        int resultado;
        resultado = a + b ;
        System.out.println("Resultado = " + resultado);
    }
    public void restar(){
        Scanner r = new Scanner(System.in);
        System.out.println("_____________RESTA____________");
        System.out.println("ingrese los numeros = ");
        int a = r.nextInt(); 
        System.out.print(" - "); 
        int b = r.nextInt();
        int resultado;
        resultado = a - b ;
        System.out.println("Resultado = " + resultado);
    }
    public void dividir(){
        Scanner d = new Scanner(System.in);
        System.out.println("_____________DIVICION____________");
        System.out.println("ingrese los numeros = ");
        double a = d.nextInt(); 
        System.out.print(" / "); 
        double b = d.nextInt();
        double resultado;
        resultado = a / b ;
        System.out.println("Resultado = " + resultado);
    }
    public void multiplicar(){
        Scanner m = new Scanner(System.in);
        System.out.println("_____________MULTIPLICAR____________");
        System.out.println("ingrese los numeros = ");
        double a = m.nextInt(); 
        System.out.print(" x "); 
        double b = m.nextInt();
        double resultado;
        resultado = a * b ;
        System.out.println("Resultado = " + resultado);
    }
    /////////////////////////////main

}