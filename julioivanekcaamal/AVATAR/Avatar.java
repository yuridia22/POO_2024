package julioivanekcaamal.AVATAR;

/**
 * Avatar
 */
import java.util.Scanner;
import java.util.Random;

public class Avatar {

    private String nombre;
    private String estilo;
    private String genero;
    private String hobby;
    private String profesion;
    private String etapaEdad;
    private String colorPiel;

    public Avatar(String nombre, String estilo, String genero, String hobby,String profesion, String etapaEdad, String colorPiel){
        setNombre(nombre);
        this.estilo = estilo;
        this.genero = genero;
        this.hobby = hobby;
        this.profesion = profesion;
        this.etapaEdad = etapaEdad;
        this.colorPiel = colorPiel;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = !nombre.equals("")?nombre:"Alex";
    }
    public String getEstilo(){
        return estilo;
    }
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getHobby(){
        return hobby;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public String getProfesion(){
        return profesion;
    }
    public void setProfesion(String profesion){
        this.profesion = profesion;
    }
    public String getEtapaEdad(){
        return etapaEdad;
    }
    public void setEtapaEdad(String etapaEdad){
        this.etapaEdad = etapaEdad;
    }
    public String getColorPiel(){
        return colorPiel;
    }
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public void saludar(){
        Scanner s = new Scanner(System.in);
        System.out.print("ingresa tu nombre = ");
        nombre = s.nextLine();
        System.out.print("dele enter para saludar");
        s.nextLine();
        System.out.println("hola como estas " + nombre );
    }
    public void poseEstilo(){
        System.out.println("elija la pose del avatar");
        System.out.println("1.- sentado 2.- caminando 3.- viendo ala camara");
        Scanner p = new Scanner(System.in);
        int opcion = p.nextInt();
        switch (opcion ) {
            case 1:
                System.out.println("el avatar esta sentado...");
                break;
            case 2:
                System.out.println("...pasos...pasos....");
                break;
            case 3: 
                System.out.println("el avatar te esta viendo fijamente");
                break;
            default:
                System.out.println("error ese numero no existe ");
                break;
        }
    }
    public void bailar(){
        System.out.println("................Bailando****");
    }
    public void jugar(){
        System.out.println("jugemos a adivinar el numeor que pienso");
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10);
        Scanner j = new Scanner(System.in);
        System.out.print("ingrese su numero del 0 a 10= ");
        int num = j.nextInt();
        if (numeroAleatorio == num) {
            System.out.println("has ganado");
        }else if (num > 10) {
            System.out.println("el numero esta fuera del juego");
        }else{
            System.out.println("has perdido no era ese numero");
        }
        
    }
    public void escucharMusica(){
        System.out.println("¡Esta canción me llega al corazón!");
    }
}