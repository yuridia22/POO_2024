public class Perro1{
    
    private double peso;
    private int estado;
    private String nombre;
    private String raza;
    private double altura;
    private int edad;

    public Perro1 (String nombre, String raza, int edad, double altura, double peso){
        setAltura(altura);
        setPeso(peso);
        setNombre(nombre);
        setRaza(raza);
        setEdad(edad);

        this.estado =1;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre.equals("")?"solo vino":nombre;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza.equals("")?"Pitbul":raza;
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

    private void setEstado(int valor){
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
        System.out.println("arr arr");
    }

    public void saltar(){
        System.out.println("salta");
    }

    public void comer(String comida){
        System.out.println("comiendo :v " + comida);
    }

    public void morir(){
        System.out.println("spathammm");
        setEstado(0);
    }
}