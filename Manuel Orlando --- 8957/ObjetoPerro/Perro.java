package ObjetoPerro;
import java.util.Random;

public class Perro{
    private String nombre;
    private String raza;
    private int edad;
    private double altura;
    private double peso;
    private int estado;

    public Perro (String nombre){
        setNombre(nombre);
        setRaza("Sharpein");
        setEdad(6);
        setAltura(0.79);
        setPeso(10.53);
        setEstado(1);
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
    public void setRaza(String r){
        this.raza = r;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int e){
        this.edad = e;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double a){
        this.altura = a;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double p){
        this.peso = p;
    }
    public int getEstado(){
        return estado;
    }
    public void setEstado(int e){
        this.estado = this.estado>0? e:0;
    }

    public void ladrar(){
        if (getEstado()>0) {
            System.out.println("Guau, guau, guau, guau, guau");   
        }
        else{
            System.out.println("Estoy con diosito");
        }
    }

    public void oir(String instruccion){
        if(getEstado()>0){
            switch (instruccion) {
                case "ladrar" : ladrar();
                case "morder" : morder();
                case "comer" :  comer("panucho");
                case "saltar" : saltar();
                case "dormir" : dormir();
            }
        }else{
            System.out.println("Ya estoy muerto");
        }
    }

    public void morder(){
        System.out.println("usdhuisdaoj hsidhsihdao ishcojsoda");
    }

    public void saltar(){
        System.out.println("Estoy saltando");
    }

    public void comer(String comida){
        System.out.println("Que rico " + comida);
    }

    public void morir(){
        Random r = new Random();
        int num = r.nextInt(3);
        if(num == 0){
            System.out.println("Murio por vejez");
            System.out.println("Adios mundo cruel");
            setEstado(0);
        }
        else if(num == 1){
            System.out.println("Murio siendo atropeyado");
            System.out.println("Adios mundo cruel");
            setEstado(0);
        }else{
            System.out.println("Murio durmiendo");
            System.out.println("Adios mundo cruel");
            setEstado(0);
        }
    }
    public void dormir(){
        System.out.println("Soñando que estoy persiguiendo una salchicha");
    }
}