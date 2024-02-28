public class Perro{
    //atributos//
    private String nombre;
    private String raza;
    private double edad;
    private double altura;
    private double peso;
    //constructor//
    public Perro (String nombre){
        this.nombre=nombre.equals("")?"Cacho":nombre;
        this.raza="sabueso";
        this.edad=6.5;
        this.altura=1.1;
        this.peso=70.0;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre.equals("")?"Cacho":nombre;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza.equals("")?"Sabueso":raza;
    }
    public double getEdad(){
        return edad;
    }
    public void setEdad(double edad){
        this.edad=(edad <6.5)?6.5:edad;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura=(altura <1.1)?1.1:altura;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso=(peso <70.0)?70.0:peso;
    }

    //metodos//

    public void ladrar(){
        System.out.println("guau,guau,guau");
    }
    public void oir(String instruccion) {
        switch (instruccion) {
            case "ladrar":
                ladrar();
                break;
            case "morder":
                morder();
                break;
            case "comer":
                saltar(); 
                comer("salchicha");
                break;
            default:
                break;
        }
    }
    
    public void morder() {
        System.out.println("guau,guau te estoy mordiendo!!");
    }
    
    public void saltar() {
        System.out.println("esta saltando");
    }
    
    public void comer(String comida) {
        System.out.println("estoy comiendo " + comida);
    }
    public void ver(){
        System.out.println("esta viendo");
    }
}