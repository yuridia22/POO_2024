public class Boxeador{
    // ATRIBUTOS
    private boolean estado;
    private String nombre;
    private double altura;
    private int edad;
    private int record;
    private double peso;
    private String categoria;

    // CONSTRUCTOR
    public Boxeador(boolean estado, String nombre, double altura, int edad, int record, double peso, String categoria){
        setEstado(estado);
        setNombre(nombre);
        setAltura(altura);
        setEdad(edad);
        setRecord(record);
        setPeso(peso);
        setCategoria(categoria);
    }

    // METODOS DE ACCESO

    public boolean getEstado(){
        return estado;
    }

    public void setEstado(boolean estado){
        if (estado == true || estado == false) {
            this.estado = estado;
        } else {
            System.out.println("Error: El estado debe ser verdadero o falso.");
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede ser nulo ni vacío.");
        }
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Error: La altura debe ser mayor que 0.");
        }
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

    public int getRecord(){
        return record;
    }

    public void setRecord(int record){
        if (record >= 0) {
            this.record = record;
        } else {
            System.out.println("Error: El record no puede ser negativo.");
        }
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Error: El peso debe ser mayor que 0.");
        }
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    // METODOS
    public void entrenar(int horas){
        if(horas > 0){
            System.out.println(nombre + " va a entrenar: " + horas + " horas");
            this.record += horas/2;
        }else{
            System.out.println(nombre + " no puedo entrenar 0 horas");
        }
    }

    public void pelear(int rounds){
        if(rounds > 0){
            System.out.println(nombre + " peleara: " + rounds + " rounds!");
            System.out.println("la pelea ha comenzado");
        }else if (rounds < 0) {
            System.out.println("la pelea no puede empezar");
        }else{
            System.out.println("deben ser horas!!!");
        }
    }

    public void recibirGolpe(int fuerza){
        System.out.println(nombre + " ha recibido " + fuerza + " libras " + "de golpeeee!! :O");
        if(fuerza >= 1000){
            System.out.println(nombre + " ha sido noqueado");
        }else{
            System.out.println(nombre + " no ha sido noqueado!!");
        }
    }

    public void descansar(){
        if(this.estado == true){
            System.out.println(nombre + " aun no descansa");
        }else{
            System.out.println(nombre + " ya se canso y por ende va a descansar");
        }
    }

}