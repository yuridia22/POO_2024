package Yaqui.Ejercicios;

public class Perro {
    private String nombre;
    private String raza;
    private double edad;
    private double altura;
    private double peso;
    private int estado;

    public Perro(String nombre) {
        setNombre(nombre);
        this.estado = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom.equals("") ? "Chucho" : nom;
    }

    public int getEstado() {
        return estado;
    }

    private void changeEstado(int valor) {
        this.estado = this.estado > 0 ? valor : 0;
    }

    public void ladrar() {
        if (getEstado() > 0)
            System.out.println("guau, guau, guau, guau,guau, guau");
        else
            System.out.println("estoy con diosito");
    }

    public void oir(String instruccion) {
        if (getEstado() > 0) {
            switch (instruccion) {
                case "ladrar":
                    ladrar();
                case "moder":
                    moder();
                case "comer":
                    saltar();
                    comer("salchicha");
            }
        } else
            System.out.println("estoy con diosito");
    }

    public void moder() {
        System.out.println("sjuiehkcjo jciojeoijfosj jeojfojoa0 te estoy mordiendo");
    }

    public void saltar() {
        System.out.println("Estoy feliz saltando");
    }

    public void comer(String comida) {
        System.out.println("que rica " + comida);
    }

    public void morir() {
        System.out.println("Adios mundo cruel");
        changeEstado(0);
    }
}