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
        this.raza = a;
    }
    public void setTipo(String b){
        this.tipo = b;
    }
    public void setDias_Vivo(int c){
        this.dias_Vivo = c;
    }
    public void setTamanio(double d){
        this.tamanio = d;
    }
    public void setColor(String e){
        this.color = e;
    }
    public void setVivo(boolean f){
        this.vivo = f;
    }

    public void volar(){
        if(vivo==true){
            System.out.println("bzzt bzzt bzzt bzzt bzzt");
        }
        else{
            System.out.println("Yoo ya estoy muerto");
        }
    }
    public void picar(){
        if(vivo==true){
            System.out.println("Por lo que me importa morire");
        }
        else{
            System.out.println("Yoo ya estoy muerto");
        }
    }
    public void trabajo(){
        switch (tipo) {
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
    public void comer(){
        if(vivo==true){
            System.out.println("EStoy comiendo miel");
        }
        else{
            System.out.println("Yoo ya estoy muerto");
        }
    }
    public void tomarAgua(){
        if(vivo==true){
            System.out.println("Donde hay agua");
            System.out.println("Ya vi donde hay, vor a beberlo");
        }
        else{
            System.out.println("Yoo ya estoy muerto");
        }
    }
}