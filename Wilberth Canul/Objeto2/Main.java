package Objeto2;

public class Main {
    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar("ryan", 10, 20.0, 1.30, 12);
        jaguar.caminar(10);
        jaguar.correr(10);
        jaguar.comunicarse();
        jaguar.enfrentarDepredador("presa");
    }
}
