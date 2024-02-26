public class Abeja {
    //Atributos
    private String raza;
    private String tipo;
    private int dias_Vivo;
    private double tamanio;
    private String color;
    private boolean vivo;

    //Constructor
    public Abeja(){
        this.vivo = true;
        this.raza = "indefinida todavia";
        this.tipo = "Larva";
        this.dias_Vivo = 1;
        this.tamanio = 0.6;
        this.color = "defecto";
    }

    
    // Se crean los getters
    public String getRaza(){
        return raza;
    }
    public String getTipo(){
        return tipo;
    }
    public int getDias_Vivo(){
        return dias_Vivo;
    }
    public double getTamanio(){
        return tamanio;
    }
    public String getColor(){
        return color;
    }
    public boolean getVivo(){
        return vivo;
    }


    //Se crean los setters
    public void setRaza(String a){
        raza = a;
    }
    public void setTipo(String b){
        tipo = b;
    }
    public void setDias_Vivo(int c){
        dias_Vivo = c;
    }
    public void setTamanio(double d){
        tamanio = d;
    }
    public void setColor(String e){
        color = e;
    }
    public void setVivo(boolean f){
        vivo = f;
    }

    public void volar(boolean vivo){
        if(vivo==true){
            System.out.println("bzzt bzzt bzzt bzzt bzzt");
        }
        else{
            System.out.println("Yoo ya estoy muerto");
        }
    }
    public void picar(boolean vivo){
        if(vivo==true){
            System.out.println("Por lo que me importa morire");
        }
        else{
            System.out.println("Yoo ya estoy muerto");
        }
    }
    public void trabajo(String t){
        switch (t) {
            case "Reyna":
                    System.out.println("Pones huevos para que la colonia crezca");
                break;
            case "Obrera":
                    System.out.println("Sales a recolectar miel");
                    System.out.println("Despues de un tiempo haces panales para la miel");
                    System.out.println("OH no, estan atacando, sales defender con tu vida");
                break;
            case "Zangano":
                    System.out.println("Vas a fecundar a la reina en:");
                    System.out.println("3...2...1...");
                    System.out.println("Terminaste");
                    System.out.println("Listo ya terminaste tu funcion principal, lo que te espera es tu muerte");
                    System.out.println("mueres");
                break;
        
            default:
                System.out.println("No escogio ningun tipo o el que eligio no existe");
                break;
        }
    }
    public void comer(boolean vivo){
        if(vivo==true){
            System.out.println("EStoy comiendo miel");
        }
        else{
            System.out.println("Yoo ya estoy muerto");
        }
    }
    public void tomarAgua(boolean vivo){
        if(vivo==true){
            System.out.println("Donde hay agua");
            System.out.println("Ya vi donde hay, vor a beberlo");
        }
        else{
            System.out.println("Yoo ya estoy muerto");
        }
    }
}