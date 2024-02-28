public class Perro{
    
    private double peso;
    private int estado;
    private String nombre;
    private String raza;
    private double altura;
    private int edad;

    public Perro (String nombre, String raza, int edad, double altura, double peso){
        setAltura(altura);
        setPeso(peso);
        setNombre(nombre);
        setRaza(raza);
        setEdad(edad);
        
        this.estado = 1;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre.equals("")?"Chucho":nombre;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza.equals("")?"Gran Danés":raza;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public int getEstado(){
        return estado;
    }

    private void changeEstado(int valor){
        this.estado = this.estado>0? valor:0;
    }

    public void ladrar(){
        if (getEstado()>0) {
            System.out.println("Guau");   
        }
        else{
            System.out.println(".............");
        }
    }

    public void oir(String instruccion){
        switch (instruccion) {
            case "ladrar" : ladrar();
            case "Morder" : morder();
            case "Comer" : saltar(); comer("croquetas");
        }
    }

    public void morder(){
        System.out.println("ñam ñam");
    }

    public void saltar(){
        System.out.println("boing");
    }

    public void comer(String comida){
        System.out.println("ammmmm " + comida);
    }

    public void morir(){
        System.out.println("spathammm");
        changeEstado(0);
    }

    public static void main (String[] args){
        Perro miperro = new Perro("Poseidon","rottweiler",1, 1, 4.8);
        System.out.println(miperro.getNombre());
        System.out.println(miperro.getRaza());
        System.out.println(miperro.getEdad() + " años");
        System.out.println(miperro.getAltura() + " m");
        System.out.println(miperro.getPeso() + " kg");
        miperro.ladrar();
        miperro.oir("comer");
        
    }
}