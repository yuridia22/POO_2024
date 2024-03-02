public class Audifonos{
    private String color;
    private int pesoenGramos;
    private String medida;
    private String encendido;
    private String conectado;
    private String marca;

    public Audifonos(){
        this.color="blanco";
        this.pesoenGramos=150;
        this.medida="pequeño";
        this.encendido="false";
        this.conectado="false";
        this.marca="apple";
    }
    public String getColor(){
        return color;
    }
    public int pesoenGramos(){
        return pesoenGramos;
    }
    public String getMedida(){
        return medida;
    }
    public String StringesEncendido(){
        return encendido;
    }
    public String esConectado(){
        return conectado;
    }
    public String getMarca(){
        return marca;
    }
    public void cargar(){
        System.out.println("se estan cargando los audifonos");
    }
    public void abrir(){
        System.out.println("los audifonos estan abiertos");
    }
    public void cerrar(){
        System.out.println("los audifonos estan cerrados");
    }
    public void encender(){
        boolean Iencendido;
        if(Iencendido){
            encendido=true;
            System.out.println("los audifonos estan prendidos");
        }else{
            System.out.println("los audifonos ya estan prendidos .-.");
        }
    }
    public void apagar(){
        if(encendido){
            encendido=false;
            System.out.println("los audifonos se apagaron");
        }else{
            System.out.println("los audifonos ya se apgaron0");
        }
    }
    public void conectar(){
        if(1conectado){
            conectado=true;
            System.out.println("los audifonos estan conectados");
        }else{
            System.out.println("los audifonos ya se conectaron :v");
        }
    }
    public void desconectar(){
        if(conectado){
            conectado=false;
            System.out.println("los audif0nos estan desconectados");
        }else{
            System.out.println("los audifonos ya se desconectaron");
        }
    }
    public static void main (String [] args){
        Audifonos losAudifonos= new Audifonos();
        losAudifonos.abrir();
        losAudifonos.cargar();
        losAudifonos.encender();
        losAudifonos.conectar();
        losAudifonos.desconectar();
        losAudifonos.apagar();
        losAudifonos.cerrar();

        System.out.println("peso de los audifonos:"+ losAudifonos.pesoenGramos()+"gramos");
        System.out.println("medida de los audifonos:"+losAudifonos.getMedida());
        System.out.println("marca de los audifonos:"+losAudifonos.getMarca());
    }
}