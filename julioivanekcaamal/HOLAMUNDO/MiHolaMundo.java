package julioivanekcaamal.HOLAMUNDO;

import java.util.Scanner;

public class MiHolaMundo {
    // Atributo
    private String mensaje;
    private String color;

    // Constructor
    public MiHolaMundo(String mensaje) {
        setMensaje(mensaje);
    }

    // Métodos de acceso
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = !mensaje.equals("")?mensaje:"HolaMundoPoo!";
    }

    // Método para cambiar el color del mensaje en la consola utilizando códigos ANSI
    public void cambiarColor() {
    Scanner s = new Scanner(System.in);
    System.out.print("Que color desea su mensaje : rojo,verde,amarillo y azul. (color en minusculas) = ");
    color = s.nextLine();
        switch (color) {
            case "rojo":
                System.out.println("\u001B[31m" + mensaje + "\u001B[0m");
                break;
            case "verde":
                System.out.println("\u001B[32m" + mensaje + "\u001B[0m");
                break;
            case "amarillo":
                System.out.println("\u001B[33m" + mensaje + "\u001B[0m");
                break;
            case "azul":
                System.out.println("\u001B[34m" + mensaje + "\u001B[0m");
                break;
            default:
                System.out.println(mensaje);
        }
    }
}