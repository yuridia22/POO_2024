package julioivanekcaamal.NOTA;
/**
 * Color
 */
import java.util.Scanner;


public class Color {

    private String nombre;
    private String ansi;

    public Color(String nombre, String ansi){
        setColor(nombre);
        this.ansi = ansi;
    }

    public String getColor(){
        return nombre;
    }
    public void setColor(String nombre){
        this.nombre = nombre.equals(" ")? "Blanco" : nombre;
    }
    public String getColorAnsi(){
        return ansi;
    }
    public void setColorAnsi(){
        Scanner A = new Scanner(System.in);
        System.out.print("Que color desea su mensaje : rojo,verde,amarillo y azul. (color en minusculas) = ");
        String color = A.nextLine();
            
    }


}