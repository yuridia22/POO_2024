package julioivanekcaamal.NOTAS;
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
    public void setColor(){
        this.nombre = nombre.equals(" ")? "Blanco" : nombre;
    }
    public String getColorAnsi(){
        return ansi;
    }
    public void setColorAnsi(){
        Scanner A = new Scanner(System.in);
        System.out.print("Que color desea su mensaje : rojo,verde,amarillo y azul. (color en minusculas) = ");
        color = s.nextLine();
            switch (A) {
                case value:
                    
                    break;
            
                default:
                    break;
            }
    }


}